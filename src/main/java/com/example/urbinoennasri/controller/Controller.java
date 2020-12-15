package com.example.urbinoennasri.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = { "/connexion" }, method = RequestMethod.GET)
    public ModelAndView connexion() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("connexion");
        return modelAndView;
    } // Requête pour afficher une page hmtl


  }
