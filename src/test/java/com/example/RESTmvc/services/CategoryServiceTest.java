package com.example.RESTmvc.services;

import com.example.RESTmvc.repositories.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CategoryServiceTest {

    public static final Long ID = 2L;
    public static final String NAME = "Jimmy";
    CategoryService categoryService;

    @Mock
    CategoryRepository categoryRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllCategories() {
    }

    @Test
    void getCategoryByName() {
    }
}