package com.cab_booking.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.intThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cab_booking.entity.Booking;

@SpringBootTest
class BookingControllerTest {
	
	@Autowired
	BookingController bookingController;
	
//	@Autowired
	Booking booking = new Booking();
	
	@Test
	void testCreateBooking() {
		
		booking.setCabType("Rickshaw");
		booking.setFromLocation("Bar");
		booking.setFromLocation("Home");
		
		int bookingId = bookingController.createBooking(booking);
		
		assertEquals(6, bookingId);
		
	}

	@Test
	@Disabled
	void testGetBooking() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetCabType() {
		fail("Not yet implemented");
	}

}
