package repository;
import models.Villa;
import java.util.LinkedHashMap;

public interface IVillaRepository {
    LinkedHashMap<Villa,Integer> displayVillaRepository();
    void addVillaRepository(LinkedHashMap<Villa, Integer> villaList);
}
