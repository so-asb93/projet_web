package com.example.urbinoennasri.controller;


import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    // Login form with error
    @RequestMapping(value = "/errorfile", method = RequestMethod.GET)
    public ModelAndView loginError(ModelAndView model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("errorfile");
        return modelAndView;    }

    @RequestMapping(value = "/authentification", method = RequestMethod.GET)
    public ModelAndView connexion() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authentification");
        return modelAndView;
    } // Requête pour afficher une page hmtl


    @RequestMapping(value = "/accueil_sondage", method = RequestMethod.GET)
    public ModelAndView showSondage() {

        ModelAndView modelAndView = new ModelAndView();
        List<Sondages> listSondages = new ArrayList<>();
        listSondages = service.findSondages();
        System.out.println("sondages = " + listSondages.toString());
        modelAndView.addObject("User",listSondages);
        modelAndView.setViewName("accueil_sondage");
        return modelAndView;
    } // Requête pour afficher une page hmtl


  }
