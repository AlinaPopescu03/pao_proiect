package com.example.booklendingsystem.Repository;

import com.example.booklendingsystem.Model.Parteners;
import com.example.booklendingsystem.Model.Prizes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PrizeRepository extends JpaRepository<Prizes, Integer> {

    @Query("select prize from Prizes prize where prize.name=:name")
    Optional<Prizes> findPrizeByName(String name);
}
