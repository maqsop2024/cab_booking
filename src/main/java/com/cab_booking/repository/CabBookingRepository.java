package com.cab_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab_booking.entity.Booking;

@Repository
public interface CabBookingRepository extends JpaRepository<Booking, Integer>{

}
