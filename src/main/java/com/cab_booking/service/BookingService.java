package com.cab_booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab_booking.entity.Booking;
import com.cab_booking.repository.CabBookingRepository;

@Service
public class BookingService {
	
	@Autowired
	CabBookingRepository cabBookingRepository;
	
	public int createBooking(Booking booking) {
		
		Booking resultBooking;
		resultBooking= cabBookingRepository.save(booking);
		return(resultBooking.getBookingId());
		
	}
	
	public Optional<Booking> getBooking(int bookingId) {
		
		Optional<Booking> resultBooking;
		resultBooking= cabBookingRepository.findById(bookingId);
		if (resultBooking.isPresent()) {
			return(resultBooking);
		}
		else {
			return null;
		}
		
		
	}
	
	
	public String getCabType(int bookingId) {
		Optional<Booking> result = cabBookingRepository.findById(bookingId);
		if (result.isPresent()) {
			Booking booking = result.get();
			return booking.getCabType();
		} else {
			return "Booking does not exist";
		}
		
	}
	
	

}
