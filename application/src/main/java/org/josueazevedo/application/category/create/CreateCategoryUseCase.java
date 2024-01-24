package org.josueazevedo.application.category.create;

import io.vavr.control.Either;
import org.josueazevedo.application.UseCase;
import org.josueazevedo.domain.validation.handler.Notification;

public abstract class CreateCategoryUseCase extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
