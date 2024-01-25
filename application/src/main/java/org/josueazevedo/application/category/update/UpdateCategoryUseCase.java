package org.josueazevedo.application.category.update;


import io.vavr.control.Either;
import org.josueazevedo.application.UseCase;
import org.josueazevedo.domain.validation.handler.Notification;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}