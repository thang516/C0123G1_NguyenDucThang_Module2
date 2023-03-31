package models;

import java.util.Arrays;
import java.util.Objects;

public class Facility {
    protected String nameFacility;
    protected String usableArea;
    protected String rentalCosts;
    protected String maximumQuantity;
    protected String typeOfRental;

    public Facility() {
    }

    public Facility(String nameFacility, String usableArea, String rentalCosts, String maximumQuantity, String typeOfRental) {
        this.nameFacility = nameFacility;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumQuantity = maximumQuantity;
        this.typeOfRental = typeOfRental;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(String maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return nameFacility.equals(facility.nameFacility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFacility);
    }

    @Override
    public String toString() {
        return "Facility : " +
                " Tên dịch vụ : '" + this.getNameFacility() + '\'' +
                ", Diện tích sử dụng :" + this.getUsableArea() +
                ",  Chi phí thuê : " + this.getRentalCosts() +
                ", Số lượng tối đa :  " + this.getMaximumQuantity() +
                ", Kiểu thuê : " + this.getTypeOfRental();
    }

    public String getInfoToCsv() {
        return nameFacility + "," + usableArea + "," + rentalCosts + "," + maximumQuantity + "," + typeOfRental;

    }
}
