package org.josueazevedo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void testCateory() {
        final var category = new Category("teste");
        Assertions.assertNotNull(category);
    }
}
