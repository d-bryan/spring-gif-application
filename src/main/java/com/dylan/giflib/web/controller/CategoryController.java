package com.dylan.giflib.web.controller;

import com.dylan.giflib.model.Category;
import com.dylan.giflib.model.Gif;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {
  @Autowired
  private SessionFactory sessionFactory;

  // Index of all categories
  @RequestMapping("/categories")
  public String listCategories(Model model) {
    // open a session
    Session session = sessionFactory.openSession();
    // create criteria builder
    CriteriaBuilder builder = session.getCriteriaBuilder();
    // create criteria for query
    CriteriaQuery<Category> criteriaQuery = builder.createQuery(Category.class);
    // specify criteria root
    criteriaQuery.from(Category.class);
    // execute query
    List<Category> categories = session.createQuery(criteriaQuery).getResultList();
    // close the session
    session.close();
    // add attributes to the template
    model.addAttribute("categories", categories);
    return "category/index";
  } // end listCategories method

  // Single category page
  @RequestMapping("/categories/{categoryId}")
  public String category(@PathVariable Long categoryId, Model model) {
    // TODO: Get the category given by categoryId
    Category category = null;

    model.addAttribute("category", category);
    return "category/details";
  } // end category method

  // Form for adding a new category
  @RequestMapping("categories/add")
  public String formNewCategory(Model model) {
    // TODO: Add model attributes needed for new form

    return "category/form";
  } // end formNewCategory method

  // Form for editing an existing category
  @RequestMapping("categories/{categoryId}/edit")
  public String formEditCategory(@PathVariable Long categoryId, Model model) {
    // TODO: Add model attributes needed for edit form

    return "category/form";
  } // end formEditCategory method

  // Update an existing category
  @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.POST)
  public String updateCategory() {
    // TODO: Update category if valid data was received

    // TODO: Redirect browser to /categories
    return null;
  } // end updateCategory method

  // Add a category
  @RequestMapping(value = "/categories", method = RequestMethod.POST)
  public String addCategory() {
    // TODO: Add category if valid data was received

    // TODO: Redirect browser to /categories
    return null;
  } // end addCategory method

  // Delete an existing category
  @RequestMapping(value = "/categories/{categoryId}/delete", method = RequestMethod.POST)
  public String deleteCategory(@PathVariable Long categoryId) {
    // TODO: Delete category if it contains no GIFs

    // TODO: Redirect browser to /categories
    return null;
  } // end deleteCategory method

} // end CategoryController class

