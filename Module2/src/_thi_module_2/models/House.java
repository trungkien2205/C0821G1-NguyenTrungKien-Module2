package models;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxAmountPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxAmountPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }



    public House(String[] strings) {
        super(strings);
        this.roomStandard = strings[6];
        this.numberOfFloors = Integer.parseInt(strings[7]);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "," + roomStandard + "," + numberOfFloors;
    }

    @Override
    public String showInformation() {
        return "House : " +super.showInformation() +'\'' +
                "Room standard " + roomStandard + '\'' +
                "Num of Floors " + numberOfFloors;
    }
}
