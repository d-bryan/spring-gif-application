package com.dylan.giflib.data;

import com.dylan.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
  private static final List<Gif> ALL_GIFS = Arrays.asList(
      new Gif("android-explosion", LocalDate.of(2015, 2, 13), "Chris Ramacciotti", false, 1),
      new Gif("ben-and-mike", LocalDate.of(2015, 10, 30), "Ben Jakuben", true, 4),
      new Gif("book-dominos", LocalDate.of(2015, 9, 15), "Craig Dennis", false, 2),
      new Gif("compiler-bot", LocalDate.of(2015, 2, 13), "Ada Lovelace", true, 3),
      new Gif("cowboy-coder", LocalDate.of(2015, 2, 13), "Grace Hopper", false, 2),
      new Gif("infinite-andrew", LocalDate.of(2015, 8, 23), "Marissa Mayer", true, 1)
  );

  /**
   * Retrieves the gif being searched for
   * @param name String name
   * @return Gif
   */
  public Gif findGifByName(String name) {
    for (Gif gif : ALL_GIFS) {
      if (gif.getName().equals(name)) {
        return gif;
      } // end if statement
    } // end for loop
    return null;
  } // end findGifByName method

  /**
   * Retrieves all gifs by category ID
   * @param id Integer ID
   * @return List<Gif>
   */
  public List<Gif> findGifByCategory(int id) {
    List<Gif> list = new ArrayList<>();
    for (Gif gif : ALL_GIFS) {
      if (gif.getCategory() == id) {
        list.add(gif);
      } // end if statement
    } // end for loop
    return list;
  } // end findGifByCategory method

  /**
   * Retrieves all favorite Gifs
   * @return List<Gif>
   */
  public List<Gif> findGifByFavorite() {
    List<Gif> list = new ArrayList<>();
    for (Gif gif : ALL_GIFS) {
      if (gif.isFavorite()) {
        list.add(gif);
      } // end if statement
    } // end for loop
    return list;
  } // end findGifByFavorite method

  /**
   * Retrieves a list of all gif objects
   * @return List<Gif>
   */
  public List<Gif> getAllGifs() {
    return ALL_GIFS;
  } // end getAllGifs method


} // end GifRepository class
