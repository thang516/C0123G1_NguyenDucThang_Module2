package repository;

import models.Booking;
import util.ReadAndWriteToFile;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository{
private final String PATH_FILE="data\\booking.csv";

    @Override
    public void addNewBookingRepository(Booking booking) {
        ReadAndWriteToFile.writeToFile(PATH_FILE,booking.getInfoToCsv(),true);
    }

    @Override
    public List<Booking> displayListBookingRepository() {
        List<Booking> bookingList=new ArrayList<>();
        List<String> stringList= ReadAndWriteToFile.readToFile(PATH_FILE);
        int size=stringList.size();
        for (int i = 0; i <size ; i++) {
            String str=stringList.get(i);
            String[] arr=str.split(",");
            Booking booking=new Booking(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }

    @Override
    public void createNewContractRepository() {

    }

    @Override
    public void displayListContractsRepository() {

    }
}
