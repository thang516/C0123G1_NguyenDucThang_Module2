package models;

public abstract class Person {
   protected String fullName;
     protected String dateOfBirth;
     protected String sex;
     protected String cmnd;
     protected String phoneNumber;
   protected String email;

    public Person(String fullName, String dateOfBirth, String sex, String cmnd, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person : " +
                " Họ và tên :'" + this.getFullName() + '\'' +
                ", Ngày sinh : " + this.getDateOfBirth() +
                ", Giới tính : '" + this.getSex() + '\'' +
                ", Số CMND " + this.getCmnd() +
                ", Số điện thoại :" + this.getPhoneNumber() +
                ", Email :'" + this.getEmail() + '\'';
    }
}
