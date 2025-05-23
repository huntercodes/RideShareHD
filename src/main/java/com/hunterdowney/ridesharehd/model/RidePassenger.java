package com.hunterdowney.ridesharehd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ride_passengers")
public class RidePassenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ride_id")
    private Ride ride;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User passenger;

    public RidePassenger() {}

    public RidePassenger(Ride ride, User passenger) {
        this.ride = ride;
        this.passenger = passenger;
    }

}