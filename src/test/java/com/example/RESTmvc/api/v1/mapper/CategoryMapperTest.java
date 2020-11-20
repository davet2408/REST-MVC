package com.example.RESTmvc.api.v1.mapper;

import com.example.RESTmvc.api.v1.model.CategoryDTO;
import com.example.RESTmvc.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {

    public static final long ID = 1L;
    public static final String NAME = "dave";
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    void categoryToCategoryDTO() throws Exception {

        //given
        Category category = new Category();
        category.setId(ID);
        category.setName(NAME);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }
}