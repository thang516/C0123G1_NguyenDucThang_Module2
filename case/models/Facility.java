package models;

import java.util.Arrays;
import java.util.Objects;

public   class Facility {
    protected String facilityId;
    protected String nameFacility;
    protected String usableArea;
    protected String rentalCosts;
    protected int maximumQuantity;
    protected String typeOfRental;

    public Facility() {
    }

    public Facility( String facilityId,String nameFacility, String usableArea, String rentalCosts, int maximumQuantity, String typeOfRental) {
        this.facilityId=facilityId;
        this.nameFacility = nameFacility;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumQuantity = maximumQuantity;
        this.typeOfRental = typeOfRental;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
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
                " id :" + this.getFacilityId()+
                ", Tên dịch vụ : '" + this.getNameFacility() + '\'' +
                ", Diện tích sử dụng :" + this.getUsableArea() +
                ",  Chi phí thuê : " + this.getRentalCosts() +
                ", Số lượng tối đa :  " + this.getMaximumQuantity() +
                ", Kiểu thuê : " + this.getTypeOfRental();
    }

    public String getInfoToCsv() {
        return facilityId+","+nameFacility + "," + usableArea + "," + rentalCosts + "," + maximumQuantity + "," + typeOfRental;

    }
}
