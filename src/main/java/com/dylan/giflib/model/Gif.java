package com.dylan.giflib.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
public class Gif {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Lob
  private byte[] bytes;

  private String description;

  @ManyToOne
  private Category category;
  private LocalDateTime dateUploaded;
  private String username = "You";
  private boolean favorite;
  private String hash;

  public Gif(){}

  public String getTimeSinceUploaded() {
    String unit = "";
    LocalDateTime now = LocalDateTime.now();
    long diff;
    if ((diff = ChronoUnit.SECONDS.between(dateUploaded, now)) < 60) {
      unit = "secs";
    } else if ((diff = ChronoUnit.MINUTES.between(dateUploaded, now)) < 60) {
      unit = "mins";
    } else if ((diff = ChronoUnit.HOURS.between(dateUploaded, now)) < 24) {
      unit = "hours";
    } else if ((diff = ChronoUnit.DAYS.between(dateUploaded, now)) < 30) {
      unit = "days";
    } else if ((diff = ChronoUnit.MONTHS.between(dateUploaded, now)) < 12) {
      unit = "months";
    } else {
      diff = ChronoUnit.YEARS.between(dateUploaded, now);
    } // end if/else if/else statement
    return String.format("%d %s", diff, unit);
  } // end getTimeSinceUploaded method

  public Long getId() {
    return id;
  } // end getId method

  public void setId(Long id) {
    this.id = id;
  } // end setId method

  public byte[] getBytes() {
    return bytes;
  } // end getBytes method

  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  } // end setBytes method

  public String getDescription() {
    return description;
  } // end getDescription method

  public void setDescription(String description) {
    this.description = description;
  } // end setDescription method

  public Category getCategory() {
    return category;
  } // end getCategory method

  public void setCategory(Category category) {
    this.category = category;
  } // end setCategory method

  public LocalDateTime getDateUploaded() {
    return dateUploaded;
  } // end getDateUploaded method

  public void setDateUploaded(LocalDateTime dateUploaded) {
    this.dateUploaded = dateUploaded;
  } // end setDateUploaded method

  public String getUsername() {
    return username;
  } // end getUsername method

  public void setUsername(String username) {
    this.username = username;
  } // end setUsername method

  public boolean isFavorite() {
    return favorite;
  } // end isFavorite method

  public void setFavorite(boolean favorite) {
    this.favorite = favorite;
  } // end setFavorite method

  public String getHash() {
    return hash;
  } // end getHash method

  public void setHash(String hash) {
    this.hash = hash;
  } // end setHash method

} // end Gif class
