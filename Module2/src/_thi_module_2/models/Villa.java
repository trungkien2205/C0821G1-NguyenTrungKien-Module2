package models;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxAmountPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxAmountPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String[] strings) {
        super(strings);
        this.roomStandard = strings[6];
        this.poolArea = Double.parseDouble(strings[7]);
        this.numberOfFloors = Integer.parseInt(strings[8]);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "," + roomStandard + "," + poolArea + "," + numberOfFloors;
    }

    @Override
    public String showInformation() {
        return "Villa" + super.showInformation() +'\''+
                "Room standard :" + roomStandard + '\'' +
                "Pool area : " + poolArea + '\'' +
                "Num of floors : " + numberOfFloors;
    }
}
