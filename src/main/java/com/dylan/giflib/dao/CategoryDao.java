package com.dylan.giflib.dao;

import com.dylan.giflib.model.Category;

import java.util.List;

public interface CategoryDao {

  /**
   * Finds all category objects and creates a list of categories
   * @return List<Category>
   */
  List<Category> findAll();

  /**
   * Finds individual category by the id of Category
   * @param id Long category ID
   * @return Category
   */
  Category findById(Long id);

  /**
   * Saves a category object
   * @param category Category
   */
  void save(Category category);

  /**
   * Deletes a category object
   * @param category Category
   */
  void delete(Category category);

} // ebd CategoryDao interface
