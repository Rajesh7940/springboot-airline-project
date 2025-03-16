package com.airlinesystems.airlines.repo;

import com.airlinesystems.airlines.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepo extends JpaRepository<Airline, Long> {
}
