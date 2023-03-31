package repository;

import models.Booking;

import java.util.List;

public interface IBookingRepository {
    void addNewBookingRepository(Booking booking);

    List<Booking> displayListBookingRepository();

    void createNewContractRepository();

    void displayListContractsRepository();


}
