package com.example.urbinoennasri.service;

import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.model.Users;

import java.util.List;

public interface Service {
    public List<Sondages> findSondages ();
    public void createSondage(Sondages sondage);
    public void supprime (Sondages sondage);
    public Sondages searchTheSondage(int sondageId);
    public void sauvegarde(Users utilisateur);


}
