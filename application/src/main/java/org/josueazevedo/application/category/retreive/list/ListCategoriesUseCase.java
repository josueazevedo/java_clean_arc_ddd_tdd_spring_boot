package org.josueazevedo.application.category.retreive.list;

import org.josueazevedo.application.UseCase;
import org.josueazevedo.domain.category.CategorySearchQuery;
import org.josueazevedo.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}