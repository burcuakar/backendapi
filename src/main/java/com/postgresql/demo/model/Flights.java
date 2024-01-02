package com.postgresql.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name = "flights")
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightid;

    private LocalDateTime departuredatetime;

    private LocalDateTime returndatetime;
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departureairportid")
    private Airports departureAirport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arrivalairportid")
    private Airports arrivalAirport;

}
