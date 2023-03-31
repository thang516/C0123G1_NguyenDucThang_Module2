package repository;

import models.Facility;
import models.Room;

import java.util.LinkedHashMap;
import java.util.List;

public interface IRoomRepository {
    LinkedHashMap<Room, Integer> displayRoomRepository();

    void addRoomRepository(LinkedHashMap<Room, Integer> roomList);
}
