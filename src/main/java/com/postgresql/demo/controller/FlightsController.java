package com.postgresql.demo.controller;

import com.postgresql.demo.model.Flights;
import com.postgresql.demo.service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightsController {

    @Autowired
    private FlightsService flightsService;

    @GetMapping
    public List<Flights> getAllFlights() {
        return flightsService.findAllFlights();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flights> getFlightById(@PathVariable Long id) {
        return flightsService.findFlightById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Flights createFlight(@RequestBody Flights flight) {
        return flightsService.saveFlight(flight);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFlight(@PathVariable Long id) {
        flightsService.deleteFlight(id);
        return ResponseEntity.ok().build();
    }

}
