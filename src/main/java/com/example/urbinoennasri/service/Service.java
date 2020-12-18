package com.example.urbinoennasri.service;

import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.model.Users;

import java.util.List;

public interface Service {
    public List<Sondages> findSondages ();
    public void supprime(int sondageId);
    public void sauvegarde(Users utilisateur);
}
