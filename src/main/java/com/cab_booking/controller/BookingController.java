package com.cab_booking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.cab_booking.entity.Booking;
import com.cab_booking.service.BookingService;

@RestController
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping(value = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int createBooking(@RequestBody Booking booking) {
		return bookingService.createBooking(booking);
	}
	
	@GetMapping(value = "getBooking/{bookingId}")
	public Optional<Booking> getBooking(@PathVariable("bookingId") int bookingId) {
		return bookingService.getBooking(bookingId);
	}
	
	@GetMapping(value = "getCabType/{bookingId}")
	public String getCabType(@PathVariable("bookingId") int bookingId) {
		return bookingService.getCabType(bookingId);
	}

	
	

}
