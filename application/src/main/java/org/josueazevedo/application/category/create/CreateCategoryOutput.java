package org.josueazevedo.application.category.create;

import org.josueazevedo.domain.category.Category;
import org.josueazevedo.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {

    public static CreateCategoryOutput from(final Category aCategory) {
        return new CreateCategoryOutput(aCategory.getId());
    }
}
