package com.dylan.giflib.model;

public class Category {
  private static int counter = 0;
  private int id;
  private String name;

  /**
   * Creates a new Category object
   * @param name String Name
   */
  public Category(String name) {
    counter += 1;
    this.id = counter;
    this.name = name;
  } // end Category constructor

  /**
   * Get current ID
   * @return Integer ID
   */
  public int getId() {
    return id;
  } // end getId method

  /**
   * Set current ID
   * @param id Integer ID
   */
  public void setId(int id) {
    this.id = id;
  } // end setId method

  /**
   * Get the current Name
   * @return String name
   */
  public String getName() {
    return name;
  } // end getName method

  /**
   * Set the name value
   * @param name String name
   */
  public void setName(String name) {
    this.name = name;
  } // end setName method

} // end Category class
