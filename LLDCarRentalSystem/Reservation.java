package LLDCarRentalSystem;

import LLDCarRentalSystem.Product.*;

import java.util.*;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle, Location pickLocation, Location dropLocation){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        this.pickUpLocation = pickLocation;
        this.dropLocation = dropLocation;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations

}

