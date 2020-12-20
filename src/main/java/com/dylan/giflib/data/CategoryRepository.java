package com.dylan.giflib.data;

import com.dylan.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
  private static final List<Category> ALL_CATEGORIES = Arrays.asList(
      new Category("Humor"),
      new Category("Animated"),
      new Category("Technology"),
      new Category("Cinematic")
  );

  /**
   * Retrieves the category being searched for
   * @param id Integer ID
   * @return Category
   */
  public Category findCategoryByName(int id) {
    for (Category category : ALL_CATEGORIES) {
      if (category.getId() == id) {
        return category;
      } // end if statement
    } // end for loop
    return null;
  } // end findCategoryByName method

  /**
   * Retrieves a list of all categories objects
   * @return List<Category>
   */
  public List<Category> getAllCategories() {
    return ALL_CATEGORIES;
  } // end getAllCategories method

} // end CategoryRepository class
