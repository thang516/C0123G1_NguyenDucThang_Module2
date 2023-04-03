package repository;

import models.Facility;
import models.Room;
import util.ReadAndWriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class RoomRepository implements IRoomRepository {

    private final String PATH_FILE = "data\\room.csv";

    @Override
    public LinkedHashMap<Room, Integer> displayRoomRepository() {
        LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            Room room = new Room(arr[0],arr[1], arr[2], arr[3],Integer.parseInt(arr[4]) , arr[5], arr[6]);
            roomIntegerLinkedHashMap.put(room, 0);
        }
        return roomIntegerLinkedHashMap;
    }

    @Override
    public void addRoomRepository(LinkedHashMap<Room, Integer> roomList) {
        File file = new File("data\\room.csv");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Set<Room> rooms = roomList.keySet();
        for (Room x : rooms) {
            ReadAndWriteToFile.writeToFile(PATH_FILE, x.getInfoToCsv(), true);

        }
    }

}
