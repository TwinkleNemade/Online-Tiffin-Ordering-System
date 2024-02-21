package com.tiffinordering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tiffinordering.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	

}
