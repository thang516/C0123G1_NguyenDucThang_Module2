package ontap_comperable_comperator.comperator;

import ontap_comperable_comperator.Student;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
