package com.sunglowsys.repository;

import com.sunglowsys.domain.HotalBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotalBookingRepository extends JpaRepository<HotalBooking, Long> {
}
