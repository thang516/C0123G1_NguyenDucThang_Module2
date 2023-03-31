package repository;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> displayRepository();

    LinkedHashMap<Facility, Integer> displayListFacilityMaintenance();

    void updateRepository(LinkedHashMap<Facility, Integer> facilityList);

}
