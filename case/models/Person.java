package models;

public abstract class Person {
   protected String fullName;
     protected String dateOfBirth;
     protected String sex;
     protected String citizenIdentification;
     protected String phoneNumber;
   protected String email;

   //citizen identification
    public Person(String fullName, String dateOfBirth, String sex, String citizenIdentification, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.citizenIdentification = citizenIdentification;
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

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
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
                ", Số CMND " + this.getCitizenIdentification() +
                ", Số điện thoại :" + this.getPhoneNumber() +
                ", Email :'" + this.getEmail() + '\'';
    }
}
