package com.example.urbinoennasri.controller;


import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.urbinoennasri.model.Users;


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

    @RequestMapping(value = "/authentification2", method = RequestMethod.GET)
    public ModelAndView connexion() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authentification2");
        return modelAndView;
    } // Requête pour afficher une page hmtl


    @RequestMapping(value = "/accueil_sondage2", method = RequestMethod.GET)
    public ModelAndView showSondage() {

        ModelAndView modelAndView = new ModelAndView();
        List<Sondages> listSondages = new ArrayList<>();
        listSondages = service.findSondages();

        System.out.println("sondages = " + listSondages.toString());
        modelAndView.addObject("listSondages",listSondages);
        modelAndView.setViewName("accueil_sondage2");
        return modelAndView;
    } // Requête pour afficher une page hmtl

    @RequestMapping(value = "/accueil_sondage2", method = RequestMethod.POST)
    public ModelAndView deleteSondage(@RequestParam("sondageId") String sondageId) {

        Integer ID = Integer.parseInt(sondageId);
        Sondages sondage = service.searchTheSondage(ID);
        service.supprime(sondage);
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("redirect:/accueil_sondage2");
        return modelAndView;
    } // Requête pour supprimer

    @RequestMapping(value = "/creation_sondage2", method = RequestMethod.GET)
    public ModelAndView showCreate() {

        ModelAndView modelAndView = new ModelAndView();
        Sondages sondages = new Sondages();
        modelAndView.addObject("sondages", sondages);
        modelAndView.setViewName("creation_sondage2");
        return modelAndView;
    } // Requête pour afficher une page hmtl


    @RequestMapping(value = "/creation_sondage2", method = RequestMethod.POST)
    public ModelAndView createSondage(Sondages sondage) {

        ModelAndView modelAndView = new ModelAndView();
        sondage.setUserid(1);
        service.createSondage(sondage);

        modelAndView.setViewName("creation_sondage2");
        return modelAndView;
    } // Requête pour créer


    @RequestMapping(value = "/inscription2", method = RequestMethod.GET)
    public ModelAndView showInscription() {
        ModelAndView modelAndView = new ModelAndView();
        Users users = new Users();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("inscription2");
        return modelAndView;
    } // Requête pour afficher une page hmtl

    @RequestMapping(value = "/inscription2", method = RequestMethod.POST)
    public ModelAndView inscription(Users users) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("in controller");
        service.sauvegarde(users);

        modelAndView.setViewName("inscription2");
        return modelAndView;
    } // Requête pour sauvegarder un user

  }
