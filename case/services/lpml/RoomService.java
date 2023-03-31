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
        Scanner scanner = new Scanner(System.in);
        Facility facility = insertInformation();
        System.out.println(" Nhập  dịch vụ miễn phí đi kèm ");
        String service = scanner.nextLine();
        Room room = new Room(facility, service);
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
