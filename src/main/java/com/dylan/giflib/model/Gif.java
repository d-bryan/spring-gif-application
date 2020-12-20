package com.dylan.giflib.model;

import java.time.LocalDate;

public class Gif {
  private String name;
  private LocalDate dateUploaded;
  private String username;
  private boolean favorite;
  private int category;

  /**
   * Creates new Gif object
   *
   * @param name
   * @param dateUploaded
   * @param username
   * @param favorite
   */
  public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int category) {
    this.name = name;
    this.dateUploaded = dateUploaded;
    this.username = username;
    this.favorite = favorite;
    this.category = category;
  } // end Gif constructor

  /**
   * Get the name value
   *
   * @return String value
   */
  public String getName() {
    return name;
  } // end getName method

  /**
   * Set the name value
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  } // end setName method

  /**
   * Get the Date uploaded value
   *
   * @return LocalDate object
   */
  public LocalDate getDateUploaded() {
    return dateUploaded;
  } // end getDateUploaded method

  /**
   * Set the Date uploaded value
   *
   * @param dateUploaded
   */
  public void setDateUploaded(LocalDate dateUploaded) {
    this.dateUploaded = dateUploaded;
  } // end setDateUploaded method

  /**
   * Get the username value
   *
   * @return String value
   */
  public String getUsername() {
    return username;
  } // end getUsername method

  /**
   * Set the username value
   *
   * @param username
   */
  public void setUsername(String username) {
    this.username = username;
  } // end setUsername method

  /**
   * Get the boolean favorite value
   *
   * @return true/false value
   */
  public boolean isFavorite() {
    return favorite;
  } // end isFavorite method

  /**
   * Set the boolean favorite value
   *
   * @param favorite
   */
  public void setFavorite(boolean favorite) {
    this.favorite = favorite;
  } // end setFavorite method

  /**
   * Retrieves the category
   * @return Integer ID
   */
  public int getCategory() {
    return category;
  } // end getCategory method

  /**
   * Sets the category
   * @param category Integer ID
   */
  public void setCategory(int category) {
    this.category = category;
  } // end setCategory method

} // end Gif class
