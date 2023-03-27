package ontap_comperable_comperator;

public class Student implements Comparable<Student>{
    private  String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // sắp xếp theo tuổi
        // nhưng mà comperable có khuyết điểm là chỉ ss đc 1 yếu ttos
//          if(this.age-o.age==0){
//              return 0;
//            } else if (this.age-o.age>0) {
//              return 1;
//          }else {
//              return -4;
//          }
        return this.name.compareTo(o.name);
    }
}
