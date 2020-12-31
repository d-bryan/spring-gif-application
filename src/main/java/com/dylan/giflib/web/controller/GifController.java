package com.dylan.giflib.web.controller;

import com.dylan.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

  // Home page - index of all GIFs
  @RequestMapping("/")
  public String listGifs(Model model) {
    // TODO: Get all gifs
    List<Gif> gifs = new ArrayList<>();

    model.addAttribute("gifs", gifs);
    return "gif/index";
  } // end listGifs method

  // Single GIF page
  @RequestMapping("/gifs/{gifId}")
  public String gifDetails(@PathVariable Long gifId, Model model) {
    // TODO: Get gif whose id is gifId
    Gif gif = null;

    model.addAttribute("gif", gif);
    return "gif/details";
  } // end gifDetails method

  // GIF image data
  @RequestMapping("/gifs/{gifId}.gif")
  @ResponseBody
  public byte[] gifImage(@PathVariable Long gifId) {
    // TODO: Return image data as byte array of the GIF whose id is gifId
    return null;
  } // end gifImage method

  // Favorites - index of all GIFs marked favorite
  @RequestMapping("/favorites")
  public String favorites(Model model) {
    // TODO: Get list of all GIFs marked as favorite
    List<Gif> faves = new ArrayList<>();

    model.addAttribute("gifs",faves);
    model.addAttribute("username","Chris Ramacciotti"); // Static username
    return "gif/favorites";
  } // end favorites method

  // Upload a new GIF
  @RequestMapping(value = "/gifs", method = RequestMethod.POST)
  public String addGif() {
    // TODO: Upload new GIF if data is valid

    // TODO: Redirect browser to new GIF's detail view
    return null;
  } // end addGif method

  // Form for uploading a new GIF
  @RequestMapping("/upload")
  public String formNewGif(Model model) {
    // TODO: Add model attributes needed for new GIF upload form

    return "gif/form";
  } // end formNewGif method

  // Form for editing an existing GIF
  @RequestMapping(value = "/gifs/{dgifI}/edit")
  public String formEditGif(@PathVariable Long gifId, Model model) {
    // TODO: Add model attributes needed for edit form

    return "gif/form";
  } // end formEditGif method

  // Update an existing GIF
  @RequestMapping(value = "/gifs/{gifId}", method = RequestMethod.POST)
  public String updateGif() {
    // TODO: Update GIF if data is valid

    // TODO: Redirect browser to updated GIF's detail view
    return null;
  } // end updateGif method

  // Delete an existing GIF
  @RequestMapping(value = "/gifs/{gifId}/delete", method = RequestMethod.POST)
  public String deleteGif(@PathVariable Long gifId) {
    // TODO: Delete the GIF whose id is gifId

    // TODO: Redirect to app root
    return null;
  } // end deleteGif method

  // Mark/unmark an existing GIF as a favorite
  @RequestMapping(value = "/gifs/{gifId}/favorite", method = RequestMethod.POST)
  public String toggleFavorite(@PathVariable Long gifId) {
    // TODO: With GIF whose id is gifId, toggle the favorite field

    // TODO: Redirect to GIF's detail view
    return null;
  } // end toggleFavorite method

  // Search results
  @RequestMapping("/search")
  public String searchResults(@RequestParam String q, Model model) {
    // TODO: Get list of GIFs whose description contains value specified by q
    List<Gif> gifs = new ArrayList<>();

    model.addAttribute("gifs",gifs);
    return "gif/index";
  } // end searchResults method

} // end GifController class
