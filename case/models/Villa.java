package models;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;
    private String numberOfFloor;


    public Villa(String facilityId, String nameFacility, String usableArea, String rentalCosts, int maximumQuantity, String typeOfRental, String roomStandard, String swimmingPoolArea, String numberOfFloor) {
        super(facilityId, nameFacility, usableArea, rentalCosts, maximumQuantity, typeOfRental);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(Facility f, String roomStandard, String swimmingPoolArea, String numberOfFloor) {
        super(f.facilityId,f.nameFacility, f.usableArea, f.rentalCosts, f.maximumQuantity, f.typeOfRental);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloor = numberOfFloor;
    }


    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa : " +
                "Id :"+this.getFacilityId()+
                ", Tên dịch vụ :'" + this.getNameFacility() + '\'' +
                ", Diện tích sử dụng :" + this.getUsableArea() +
                ", Chi phí thuê :" + this.getRentalCosts() +
                ", Số lượng tối đa :" + this.getMaximumQuantity() +
                ", Tiêu chuẩn phòng : '" + this.getRoomStandard() + '\'' +
                ", Diện tích hồ bơi :" + this.getSwimmingPoolArea() +
                ",Kiểu thuê :" + this.getTypeOfRental() +
                ", Số tầng :" + this.getNumberOfFloor();
    }

    public String getInfoToCsv() {
        return facilityId+","+nameFacility + "," + usableArea + "," + rentalCosts + "," + maximumQuantity + "," + roomStandard + "," +
                swimmingPoolArea + "," + typeOfRental + "," + numberOfFloor;
    }
}
