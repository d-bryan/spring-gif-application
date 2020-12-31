package com.dylan.giflib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String colorCode;

  @OneToMany(mappedBy = "category")
  private List<Gif> gifs = new ArrayList<>();

  public Category(){}

  public Long getId() {
    return id;
  } // end getId method

  public void setId(Long id) {
    this.id = id;
  } // end setId method

  public String getName() {
    return name;
  } // end getName method

  public void setName(String name) {
    this.name = name;
  } // end setName method

  public String getColorCode() {
    return colorCode;
  } // end getColorCode method

  public void setColorCode(String colorCode) {
    this.colorCode = colorCode;
  } // end setColorCode method

  public List<Gif> getGifs() {
    return gifs;
  } // end getGifs method

  public void setGifs(List<Gif> gifs) {
    this.gifs = gifs;
  } // end setGifs method

} // end Category class
