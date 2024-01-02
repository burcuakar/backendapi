package com.postgresql.demo.service;

import com.postgresql.demo.model.Airports;
import com.postgresql.demo.repo.AirportsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportsService {

    @Autowired
    private AirportsRepo airportsRepo;

    public Airports saveAirport(Airports airport) {
        return airportsRepo.save(airport);
    }

    public Optional<Airports> findAirportById(Long id) {
        return airportsRepo.findById(id);
    }

    public List<Airports> findAllAirports() {
        return airportsRepo.findAll();
    }

    public void deleteAirport(Long id) {
        airportsRepo.deleteById(id);
    }
}
