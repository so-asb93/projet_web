package com.example.urbinoennasri.service;


import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.model.Users;
import com.example.urbinoennasri.repository.Srepository;
import com.example.urbinoennasri.repository.Urepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class IService implements Service{
    @Autowired
    Srepository srepository;

    @Autowired
    Urepository urepository;
    public List<Sondages> findSondages () {
        List<Sondages> listSondages = new ArrayList<>();
        listSondages = srepository.findSondages();

        return listSondages;
    }

    @Override
    public void supprime (Sondages sondage) {

        srepository.delete(sondage);
    }

    @Override
    public void sauvegarde(Users utilisateur){
        System.out.println("in service");

        urepository.save(utilisateur);
    }
    @Override
    public void createSondage (Sondages sondage) {

        srepository.save(sondage);
    }

    @Override
    public Sondages searchTheSondage(int sondageId){
        return srepository.searchTheSondage(sondageId);
    }

}
