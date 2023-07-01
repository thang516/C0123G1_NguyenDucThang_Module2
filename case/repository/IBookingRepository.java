package repository;

import models.Booking;
import models.Facility;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

public interface IBookingRepository {

    TreeSet<Booking> displayListBookingRepository();
    void updateRepository(TreeSet<Booking> facilityList);
}
