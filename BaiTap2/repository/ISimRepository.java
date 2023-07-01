package repository;

import model.Sim;

import java.util.List;

public interface ISimRepository {
    List<Sim> displayRepository();
    void  addRepository(List<Sim> simList);
}
