package com.dylan.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

  @RequestMapping("/")
  public String home() {
    return "home";
  } // end home route

  @RequestMapping("/categories")
  public String categories() {
    return "categories";
  } // end categories route

  @RequestMapping("/category")
  public String category() {
    return "category";
  } // end category route

  @RequestMapping("/gif-details")
  public String gifDetails() {
    return "gif-details";
  } // end gifDetails route

  @RequestMapping("/favorites")
  public String favorites () {
    return "favorites";
  } // end favorites route

} // end GifController class
