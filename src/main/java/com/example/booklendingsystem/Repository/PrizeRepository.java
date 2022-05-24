package com.example.booklendingsystem.Repository;

import com.example.booklendingsystem.Model.Prizes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrizeRepository extends JpaRepository<Prizes, Integer> {
}
