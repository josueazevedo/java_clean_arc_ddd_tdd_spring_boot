package org.josueazevedo.application.category.create;

import io.vavr.API;
import io.vavr.control.Either;
import org.josueazevedo.domain.category.Category;
import org.josueazevedo.domain.category.CategoryGateway;
import org.josueazevedo.domain.validation.handler.Notification;

public class DefaultCreateCategoryUseCase extends CreateCategoryUseCase{

    private final CategoryGateway categoryGateway;

    public DefaultCreateCategoryUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public Either<Notification, CreateCategoryOutput> execute(CreateCategoryCommand anIn) {
        final var aCategory = Category.newCategory(anIn.name(), anIn.description(), anIn.isActive());

        final var notification = Notification.create();

        aCategory.validate(notification);

        return notification.hasError() ? API.Left(notification) : create(aCategory);
    }

    private Either<Notification, CreateCategoryOutput> create(final Category aCategory) {
        return API.Try(() -> this.categoryGateway.create(aCategory))
                .toEither()
                .bimap(Notification::create, CreateCategoryOutput::from);
    }

    private Either<Notification, CreateCategoryOutput> createOther(final Category aCategory) {
        try {
            return API.Right(CreateCategoryOutput.from(this.categoryGateway.create(aCategory)));
        } catch (Throwable e) {
            return API.Left(Notification.create(e));
        }
    }
}
