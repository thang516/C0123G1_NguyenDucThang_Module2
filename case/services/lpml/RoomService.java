package services.lpml;

import models.Facility;
import models.House;
import models.Room;
import repository.RoomRepository;
import services.IRoomService;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import static services.lpml.FacilityService.insertInformation;

public class RoomService implements IRoomService {
    static RoomRepository roomRepository = new RoomRepository();
    static LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = roomRepository.displayRoomRepository();

    public void addRoomCsv() {
        roomRepository.addRoomRepository(roomIntegerLinkedHashMap);
    }

    @Override
    public void add() {
        Room room = new Room();
        try {
            Scanner scanner = new Scanner(System.in);
            Facility facility = insertInformation("Room");
            System.out.println(" Nhập  dịch vụ miễn phí đi kèm ");
            String service = scanner.nextLine();
            room = new Room(facility, service);
        } catch (Exception e) {
            e.printStackTrace();
        }
        roomIntegerLinkedHashMap.put(room, 0);
    }

    @Override
    public void display() {
        Set<Room> keySet = roomIntegerLinkedHashMap.keySet();
        for (Room key : keySet) {
            System.out.println(key + " " + roomIntegerLinkedHashMap.get(key));
        }
    }
}
