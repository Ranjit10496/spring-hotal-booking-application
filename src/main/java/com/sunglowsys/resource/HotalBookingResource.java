package com.sunglowsys.resource;

import com.sunglowsys.domain.HotalBooking;
import com.sunglowsys.service.HotalBookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HotalBookingResource {
    private final Logger logger = LoggerFactory.getLogger(HotalBookingResource.class);
    private final HotalBookingService hotalBookingService;


    public HotalBookingResource(HotalBookingService hotalBookingService) {
        this.hotalBookingService = hotalBookingService;
    }
    @PostMapping("/hotalBooking")
    public ResponseEntity<HotalBooking> createHotalBooking(HotalBooking hotalBooking){
        logger.debug("request to create hotalBooking:{}",hotalBooking);
        HotalBooking result = hotalBookingService.save(hotalBooking);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/hotalBooking")
    public ResponseEntity<HotalBooking> updateHotalBooking (HotalBooking hotalBooking){
        logger.debug("request to update hotalBooking:{}",hotalBooking);
        if (hotalBooking.getHotalId()==null) {
            throw new RuntimeException("it not be must null");
        }
        HotalBooking result = hotalBookingService.update(hotalBooking);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/hotalBooking")
    public ResponseEntity<Page<HotalBooking>> findAllHotalBooking(Pageable pageable){
        logger.debug("request to findAll hotalBooking:{}",pageable);
        Page<HotalBooking> result = hotalBookingService.findAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/hotalBooking/{id}")
    public ResponseEntity<Optional<HotalBooking>> findOneHotalBooking(@PathVariable Long id){
        logger.debug("request to findOne hotalBookking:{}",id);
        Optional<HotalBooking> result = hotalBookingService.findOne(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    public ResponseEntity<Void> deleteHotalBooking(@PathVariable Long id) {
        logger.debug("request to delete hotalBooking:{}",id);
        hotalBookingService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
