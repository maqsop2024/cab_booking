package com.cab_booking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Booking {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingId;
	private String fromLocation;
	private String toLocation;
	private String cabType;
}
