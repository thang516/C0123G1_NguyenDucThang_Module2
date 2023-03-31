package repository;

import models.Facility;
import models.House;

import java.util.LinkedHashMap;
import java.util.List;

public interface IHouseRepository {
    LinkedHashMap<House, Integer> displayHouseRepository();

    void updateRepository(LinkedHashMap<House, Integer> houseList);

}
