package repository;

import models.Booking;
import models.Employee;
import models.Facility;
import util.ReadAndWriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class BookingRepository implements IBookingRepository {
    private final String PATH_FILE = "data\\booking.csv";

    @Override
    public TreeSet<Booking> displayListBookingRepository() {
        TreeSet<Booking> bookingList = new TreeSet<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }

    @Override
    public void updateRepository(TreeSet<Booking> bookings) {
        File file = new File("data\\booking.csv");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Booking x : bookings) {
            ReadAndWriteToFile.writeToFile(PATH_FILE, x.getInfoToCsv(), true);
        }
    }
}
