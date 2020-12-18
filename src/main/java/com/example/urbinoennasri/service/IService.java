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


    public void supprime (int sondageId) {
        srepository.supprime(sondageId);
    }

    @Override
    public void sauvegarde(Users utilisateur){
        System.out.println("in service");

        urepository.save(utilisateur);
    }

}
