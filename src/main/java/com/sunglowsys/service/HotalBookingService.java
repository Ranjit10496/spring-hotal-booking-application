package com.sunglowsys.service;

import com.sunglowsys.domain.HotalBooking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface HotalBookingService {
    HotalBooking save(HotalBooking hotalBooking);
    HotalBooking update(HotalBooking hotalBooking);
    Page<HotalBooking> findAll(Pageable pageable);
    Optional<HotalBooking> findOne(Long id);
    void delete(Long id);
}
