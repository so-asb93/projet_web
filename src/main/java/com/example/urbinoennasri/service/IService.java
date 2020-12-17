package com.example.urbinoennasri.service;


import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class IService implements Service{
    @Autowired
   Repository repository;
    public List<Sondages> findSondages () {
        List<Sondages> listSondages = new ArrayList<>();
        listSondages = repository.findSondages();

        return listSondages;
    }
}
