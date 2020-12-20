package com.dylan.giflib.controller;

import com.dylan.giflib.data.CategoryRepository;
import com.dylan.giflib.data.GifRepository;
import com.dylan.giflib.model.Category;
import com.dylan.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GifController {

  @Autowired
  private GifRepository gifRepository;
  @Autowired
  private CategoryRepository categoryRepository;

  @RequestMapping("/")
  public String home(ModelMap modelMap) {
    List<Gif> allGifs = gifRepository.getAllGifs();
    modelMap.put("gifs", allGifs);
    return "home";
  } // end home route

  @RequestMapping("/categories")
  public String categories(ModelMap modelMap) {
    List<Category> allCategories = categoryRepository.getAllCategories();
    modelMap.put("categories", allCategories);
    return "categories";
  } // end categories route

  @RequestMapping("/category/{id}")
  public String category(@PathVariable int id, ModelMap modelMap) {
    Category category = categoryRepository.findCategoryByName(id);
    List<Gif> gifList = gifRepository.findGifByCategory(id);
    modelMap.put("category", category);
    modelMap.put("gifs", gifList);
    return "category";
  } // end category route

  @RequestMapping("/gif/{name}")
  public String gifDetails(@PathVariable String name, ModelMap modelMap) {
    Gif gif = gifRepository.findGifByName(name);
    modelMap.put("gif", gif);
    return "gif-details";
  } // end gifDetails route

  @RequestMapping("/favorites")
  public String favorites(ModelMap modelMap) {
    List<Gif> gifList = gifRepository.findGifByFavorite();
    modelMap.put("gifs", gifList);
    return "favorites";
  } // end favorites route

} // end GifController class
