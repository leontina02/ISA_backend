package com.leontina_stosic.singidunum.biblioteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leontina_stosic.singidunum.biblioteka.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
