package com.javaproject.airlinebookingapp.repository;

import com.javaproject.airlinebookingapp.domain.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {

}
