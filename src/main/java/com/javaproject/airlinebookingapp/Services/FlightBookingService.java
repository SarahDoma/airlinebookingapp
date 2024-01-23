package com.javaproject.airlinebookingapp.services;

import com.javaproject.airlinebookingapp.domain.FlightBooking;
import com.javaproject.airlinebookingapp.services.FlightBookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlightBookingService {
    FlightBooking saveFlight(FlightBooking flightBooking);
    FlightBooking getFlightById(long Id);

    List<FlightBooking> getAllFlights();

    FlightBooking updateFlightById(FlightBooking flightBooking);

    void deleteFlight(long Id);

}
