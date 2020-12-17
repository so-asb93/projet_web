package com.example.urbinoennasri.service;

import com.example.urbinoennasri.model.Sondages;

import java.util.List;

public interface Service {
    public List<Sondages> findSondages ();
    public void supprime(int sondageId);
}
