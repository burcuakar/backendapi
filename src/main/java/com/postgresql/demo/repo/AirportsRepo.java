package com.postgresql.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.postgresql.demo.model.Airports;

@RepositoryRestResource
public interface AirportsRepo extends JpaRepository<Airports, Long> {

}
