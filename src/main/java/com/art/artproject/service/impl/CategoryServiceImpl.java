package com.art.artproject.service.impl;

import com.art.artproject.dto.CategoryResponse;
import com.art.artproject.dto.NewCategoryRequest;
import com.art.artproject.entity.Category;
import com.art.artproject.repo.CategoryRepo;
import com.art.artproject.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public CategoryResponse saveNewCategory(NewCategoryRequest request) {
        Category category=Category.of(request);
        return mapper.map(categoryRepo.save(category),CategoryResponse.class);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void delete(Long id) {

        if (categoryRepo.existsById(id)){
            categoryRepo.deleteById(id);

        }
    }
}
