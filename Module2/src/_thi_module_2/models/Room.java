package models;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxAmountPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxAmountPeople, rentalType);
        this.freeService = freeService;
    }


    public Room(String[] strings) {
        super(strings);
        this.freeService = strings[6];
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," + freeService;
    }

    @Override
    public String showInformation() {
        return "Room :" +super.showInformation() + '\''+
                "free Service :" + freeService;
    }
}
