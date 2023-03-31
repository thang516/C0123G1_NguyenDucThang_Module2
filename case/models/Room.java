package models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String nameFacility, String usableArea, String rentalCosts, String maximumQuantity, String typeOfRental, String freeServiceIncluded) {
        super(nameFacility, usableArea, rentalCosts, maximumQuantity, typeOfRental);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(Facility f, String freeServiceIncluded) {
        super(f.nameFacility, f.usableArea, f.rentalCosts, f.maximumQuantity, f.typeOfRental);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public Room() {
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }


    @Override
    public String toString() {
        return "Room :" +
                ", Tên dịch vụ :'" + this.getNameFacility() + '\'' +
                ", Diện tích sử dụng :" + this.getUsableArea() +
                ", Chi phí thuê :" + this.getRentalCosts() +
                ", Số lượng tối đa :" + this.getMaximumQuantity() +
                ", Kiểu thuê :" + this.getTypeOfRental() +
                ", Dịch vụ miễn phí đi kèm :'" + this.getFreeServiceIncluded() + '\'';

    }

    public String getInfoToCsv() {
        return nameFacility + "," + usableArea + "," + rentalCosts + "," + maximumQuantity + "," + typeOfRental + ","
                + freeServiceIncluded;

    }
}
