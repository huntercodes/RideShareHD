package com.hunterdowney.ridesharehd.repository;

import com.hunterdowney.ridesharehd.model.RidePassenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RidePassengerRepository extends JpaRepository<RidePassenger, Long> {
}