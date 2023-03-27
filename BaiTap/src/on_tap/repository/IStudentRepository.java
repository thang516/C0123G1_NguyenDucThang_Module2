package on_tap.repository;

import on_tap.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> display();
    void add();
    void delete(int studentId);
    void edit(int studentId);
}
