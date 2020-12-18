package com.example.urbinoennasri.repository;

import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Urepository extends JpaRepository<Users,Integer> {


}
