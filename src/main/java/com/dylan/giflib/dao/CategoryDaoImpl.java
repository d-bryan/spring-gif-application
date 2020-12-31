package com.dylan.giflib.dao;

import com.dylan.giflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<Category> findAll() {
    // open a session
    Session session = sessionFactory.openSession();
    // get criteria builder
    CriteriaBuilder builder = session.getCriteriaBuilder();
    // create criteria for query
    CriteriaQuery<Category> criteriaQuery = builder.createQuery(Category.class);
    // specify criteria root
    criteriaQuery.from(Category.class);
    // execute query
    List<Category> categories = session.createQuery(criteriaQuery).getResultList();
    // close the session
    session.close();

    return categories;
  } // end findAll method

  @Override
  public Category findById(Long id) {
    return null;
  } // end findById method

  @Override
  public void save(Category category) {

  } // end save method

  @Override
  public void delete(Category category) {

  } // end delete method

} // end CategoryDaoImpl class
