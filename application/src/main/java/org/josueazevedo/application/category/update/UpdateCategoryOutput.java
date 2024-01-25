package org.josueazevedo.application.category.update;

import org.josueazevedo.domain.category.Category;
import org.josueazevedo.domain.category.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {

    public static UpdateCategoryOutput from(final Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId());
    }
}