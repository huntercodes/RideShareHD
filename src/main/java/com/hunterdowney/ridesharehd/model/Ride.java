package com.hunterdowney.ridesharehd.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;
    private String destination;

    private LocalDateTime rideDateTime;
    private int maxPassengers;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private User driver;

    private boolean isCompleted;

    @OneToMany(mappedBy = "ride", cascade = CascadeType.ALL)
    private Set<RidePassenger> passengers = new HashSet<>();

    public Ride() {}

    public Ride(String origin, String destination, LocalDateTime rideDateTime, int maxPassengers, User driver) {
        this.origin = origin;
        this.destination = destination;
        this.rideDateTime = rideDateTime;
        this.maxPassengers = maxPassengers;
        this.driver = driver;
        this.isCompleted = false;
    }

}