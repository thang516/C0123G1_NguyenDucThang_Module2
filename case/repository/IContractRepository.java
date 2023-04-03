package repository;

import models.Booking;
import models.Contract;

import java.util.TreeSet;

public interface IContractRepository {
    void updateRepository(TreeSet<Contract> contract);

    TreeSet<Contract> displayListContracts();

}
