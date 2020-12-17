package com.example.urbinoennasri.repository;
import com.example.urbinoennasri.model.Sondages;
import com.example.urbinoennasri.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Sondages,Integer> {

    @Query(value = "select * from sondages", nativeQuery = true)
    public List<Sondages> findSondages () ;

    @Query(value = "DELETE FROM sondages WHERE idsondages=?1", nativeQuery = true)
    public void supprime (int sondageId) ;

}
