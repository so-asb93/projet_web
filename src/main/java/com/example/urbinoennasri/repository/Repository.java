package com.example.urbinoennasri.repository;
import com.example.urbinoennasri.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Users,Integer> {

    }
