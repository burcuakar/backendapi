package com.postgresql.demo.repo;

import com.postgresql.demo.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepo extends JpaRepository<Flights, Long> {

}
