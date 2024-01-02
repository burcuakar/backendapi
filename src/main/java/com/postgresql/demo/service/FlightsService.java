package com.postgresql.demo.service;

import com.postgresql.demo.model.Flights;
import com.postgresql.demo.repo.FlightsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightsService {

    @Autowired
    private FlightsRepo flightsRepo;

    public Flights saveFlight(Flights flight) {
        return flightsRepo.save(flight);
    }

    public Optional<Flights> findFlightById(Long id) {
        return flightsRepo.findById(id);
    }

    public List<Flights> findAllFlights() {
        return flightsRepo.findAll();
    }

    public void deleteFlight(Long id) {
        flightsRepo.deleteById(id);
    }

}
