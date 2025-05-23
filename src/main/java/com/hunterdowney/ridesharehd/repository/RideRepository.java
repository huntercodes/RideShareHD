package com.hunterdowney.ridesharehd.repository;

import com.hunterdowney.ridesharehd.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RideRepository extends JpaRepository<Ride, Long> {
    List<Ride> findByDestinationContainingIgnoreCase(String destination);
    List<Ride> findByRideDateTimeAfter(LocalDateTime dateTime);
}