package src.main.java.com.web.urbinoennasri.projet_web.controller;


@Controller
public class Controller {

    @RequestMapping(value = { "/connexion" }, method = RequestMethod.GET)
    public ModelAndView connexion() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("connexion");
        return modelAndView;
    } // Requête pour afficher une page hmtl

  }
