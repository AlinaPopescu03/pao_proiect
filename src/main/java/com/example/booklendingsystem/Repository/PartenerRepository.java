package com.example.booklendingsystem.Repository;

import com.example.booklendingsystem.Model.Parteners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PartenerRepository extends JpaRepository<Parteners, Integer> {

    @Query("select partener from Parteners partener where partener.name=:name")
    Optional<Parteners> findPartenerByName(String name);
}
