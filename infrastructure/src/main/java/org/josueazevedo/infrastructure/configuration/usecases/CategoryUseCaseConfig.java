package org.josueazevedo.infrastructure.configuration.usecases;

import org.josueazevedo.application.category.create.CreateCategoryUseCase;
import org.josueazevedo.application.category.create.DefaultCreateCategoryUseCase;
import org.josueazevedo.application.category.delete.DefaultDeleteCategoryUseCase;
import org.josueazevedo.application.category.delete.DeleteCategoryUseCase;
import org.josueazevedo.application.category.retreive.get.DefaultGetCategoryByIdUseCase;
import org.josueazevedo.application.category.retreive.get.GetCategoryByIdUseCase;
import org.josueazevedo.application.category.retreive.list.DefaultListCategoriesUseCase;
import org.josueazevedo.application.category.retreive.list.ListCategoriesUseCase;
import org.josueazevedo.application.category.update.DefaultUpdateCategoryUseCase;
import org.josueazevedo.application.category.update.UpdateCategoryUseCase;
import org.josueazevedo.domain.category.CategoryGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryUseCaseConfig {

    private final CategoryGateway categoryGateway;

    public CategoryUseCaseConfig(final CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Bean
    public CreateCategoryUseCase createCategoryUseCase() {
        return new DefaultCreateCategoryUseCase(categoryGateway);
    }

    @Bean
    public UpdateCategoryUseCase updateCategoryUseCase() {
        return new DefaultUpdateCategoryUseCase(categoryGateway);
    }

    @Bean
    public GetCategoryByIdUseCase getCategoryByIdUseCase() {
        return new DefaultGetCategoryByIdUseCase(categoryGateway);
    }

    @Bean
    public ListCategoriesUseCase listCategoriesUseCase() {
        return new DefaultListCategoriesUseCase(categoryGateway);
    }

    @Bean
    public DeleteCategoryUseCase deleteCategoryUseCase() {
        return new DefaultDeleteCategoryUseCase(categoryGateway);
    }
}
