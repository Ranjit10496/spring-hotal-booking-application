package com.sunglowsys.service;

import com.sunglowsys.domain.HotalBooking;
import com.sunglowsys.repository.HotalBookingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotalBookingServiceImpl implements HotalBookingService {
    private final Logger logger = LoggerFactory.getLogger(HotalBookingServiceImpl.class);
    private final HotalBookingRepository hotalBookingRepository;

    public HotalBookingServiceImpl(HotalBookingRepository hotalBookingRepository) {
        this.hotalBookingRepository = hotalBookingRepository;
    }

    @Override
    public HotalBooking save(HotalBooking hotalBooking) {
        logger.debug("request to save hotalBooking:{}", hotalBooking);
        return hotalBookingRepository.save(hotalBooking);
    }

    @Override
    public HotalBooking update(HotalBooking hotalBooking) {
        logger.debug("resquest to update hotalBooking:{}", hotalBooking);
        return hotalBookingRepository.save(hotalBooking);
    }

    @Override
    public Page<HotalBooking> findAll(Pageable pageable) {
        logger.debug("request to findAll hotalBooking:{}", pageable);
        return hotalBookingRepository.findAll(pageable);
    }

    @Override
    public Optional<HotalBooking> findOne(Long id) {
        logger.debug("request to findOne hotalBooking:{}", id);
        return hotalBookingRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("request to delete hotalBooking:{}", id);
        hotalBookingRepository.deleteById(id);
    }
}
