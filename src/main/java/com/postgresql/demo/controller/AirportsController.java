package com.postgresql.demo.controller;

import com.postgresql.demo.model.Airports;
import com.postgresql.demo.service.AirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportsController {

    @Autowired
    private AirportsService airportsService;

    @GetMapping
    public List<Airports> getAllAirports() {
        return airportsService.findAllAirports();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Airports> getAirportById(@PathVariable Long id) {
        return airportsService.findAirportById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Airports createAirport(@RequestBody Airports airport) {
        return airportsService.saveAirport(airport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAirport(@PathVariable Long id) {
        airportsService.deleteAirport(id);
        return ResponseEntity.ok().build();
    }
}
