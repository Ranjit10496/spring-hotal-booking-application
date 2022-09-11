package com.sunglowsys.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "hotel_booking")
public class HotalBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String checkInDate;
    @NotNull
    private String checkOutDate;
    private Integer totalGuest;
    private Integer noOfNight;
    @NotNull
    private Integer noOfrooms;
    private float bookingAmount;
    private Long hotalId;
    private Long customerId;
    private Long roomTypeId;
    private Long ratePlan;

    public HotalBooking() {
    }

    public HotalBooking(String checkInDate, String checkOutDate, Integer totalGuest, Integer noOfNight, Integer noOfrooms, float bookingAmount, Long hotalId, Long customerId, Long roomTypeId, Long ratePlan) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalGuest = totalGuest;
        this.noOfNight = noOfNight;
        this.noOfrooms = noOfrooms;
        this.bookingAmount = bookingAmount;
        this.hotalId = hotalId;
        this.customerId = customerId;
        this.roomTypeId = roomTypeId;
        this.ratePlan = ratePlan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(Integer totalGuest) {
        this.totalGuest = totalGuest;
    }

    public Integer getNoOfNight() {
        return noOfNight;
    }

    public void setNoOfNight(Integer noOfNight) {
        this.noOfNight = noOfNight;
    }

    public Integer getNoOfrooms() {
        return noOfrooms;
    }

    public void setNoOfrooms(Integer noOfrooms) {
        this.noOfrooms = noOfrooms;
    }

    public float getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(float bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Long getHotalId() {
        return hotalId;
    }

    public void setHotalId(Long hotalId) {
        this.hotalId = hotalId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Long getRatePlan() {
        return ratePlan;
    }

    public void setRatePlan(Long ratePlan) {
        this.ratePlan = ratePlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotalBooking that = (HotalBooking) o;
        return Float.compare(that.bookingAmount, bookingAmount) == 0 && Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(noOfNight, that.noOfNight) && Objects.equals(noOfrooms, that.noOfrooms) && Objects.equals(hotalId, that.hotalId) && Objects.equals(customerId, that.customerId) && Objects.equals(roomTypeId, that.roomTypeId) && Objects.equals(ratePlan, that.ratePlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, totalGuest, noOfNight, noOfrooms, bookingAmount, hotalId, customerId, roomTypeId, ratePlan);
    }

    @Override
    public String toString() {
        return "HotalBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest=" + totalGuest +
                ", noOfNight=" + noOfNight +
                ", noOfrooms=" + noOfrooms +
                ", bookingAmount=" + bookingAmount +
                ", hotalId=" + hotalId +
                ", customerId=" + customerId +
                ", roomTypeId=" + roomTypeId +
                ", ratePlan=" + ratePlan +
                '}';
    }
}
