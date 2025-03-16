package com.airlinesystems.airlines.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long airlineId;
    private String name;
    private String icaoCode;
    private String iataCode;
    private String country;
    private String contactEmail;
    private String contactPhone;
    private String status;
    private Long registeredBy;
    private LocalDateTime registeredAt;
}
