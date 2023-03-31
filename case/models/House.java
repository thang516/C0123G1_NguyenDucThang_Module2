package models;

public class House extends Facility {
    private String roomStandard;
    private String numberOfFloor;

    public House(String nameFacility, String usableArea, String rentalCosts, String maximumQuantity, String typeOfRental, String roomStandard, String numberOfFloor) {
        super(nameFacility, usableArea, rentalCosts, maximumQuantity, typeOfRental);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(Facility f, String roomStandard, String numberOfFloor) {
        super(f.nameFacility, f.usableArea, f.rentalCosts, f.maximumQuantity, f.typeOfRental);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Hourse :" +
                ", Tên dịch vụ : " + this.getNameFacility() + '\'' +
                ", Diện tích sử dụng : " + this.getUsableArea() +
                ", Chi phí thuê :" + this.getRentalCosts() +
                ", Số lượng tối đa : " + this.getMaximumQuantity() +
                ", Kiểu thuê :  " + this.getTypeOfRental() +
                ", Tiêu chuẩn phòng :" + this.getRoomStandard() + '\'' +
                ", Số tầng :" + this.getNumberOfFloor();
    }

    public String getInfoToCsv() {
        return nameFacility + "," + usableArea + "," + rentalCosts + "," + maximumQuantity + "," + typeOfRental + "," + roomStandard + "," + numberOfFloor;
    }
}
