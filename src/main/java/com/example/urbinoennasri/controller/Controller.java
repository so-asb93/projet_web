package com.example.urbinoennasri.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = { "/authentification" }, method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView connexion() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authentification");
        return modelAndView;
    } // Requête pour afficher une page hmtl


  }
