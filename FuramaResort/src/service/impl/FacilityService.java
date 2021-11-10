package service.impl;

import common.ReadWriteFile;
import common.Validation;
import models.*;
import service.IFacilityService;

import java.util.*;

public class FacilityService implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    private static final String HOUSE_PATH = "/Users/nguyentrungkien/Desktop/Module2/FuramaResort/src/data/house.csv";
    private static final String ROOM_PATH = "/Users/nguyentrungkien/Desktop/Module2/FuramaResort/src/data/room.csv";
    private static final String VILLA_PATH = "/Users/nguyentrungkien/Desktop/Module2/FuramaResort/src/data/room.csv";

    ReadWriteFile write = new ReadWriteFile();
    ReadWriteFile read = new ReadWriteFile();

    private List<House> readHouseCsv() {
        ReadWriteFile read = new ReadWriteFile();
        List<String[]> list = new ArrayList<>(read.read(HOUSE_PATH));
        List<House> houseList = new ArrayList<>();
        for (String[] strings : list) {
            House house = new House(strings);
            houseList.add(house);
        }
        return houseList;
    }

    private List<Room> readRoomCsv() {
        ReadWriteFile read = new ReadWriteFile();
        List<String[]> list = new ArrayList<>(read.read(ROOM_PATH));
        List<Room> roomList = new ArrayList<>();
        for (String[] strings : list) {
            Room room = new Room(strings);
            roomList.add(room);
        }
        return roomList;
    }

    private List<Villa> readVillaCsv() {
        ReadWriteFile read = new ReadWriteFile();
        List<String[]> list = new ArrayList<>(read.read(VILLA_PATH));
        List<Villa> villaList = new ArrayList<>();
        for (String[] strings : list) {
            Villa villa = new Villa(strings);
            villaList.add(villa);
        }
        return villaList;
    }

    @Override
    public void showListFacility() {
        List<Room> roomList = new ArrayList<>(readRoomCsv());
        List<House> houseList = new ArrayList<>(readHouseCsv());
        List<Villa> villaList = new ArrayList<>(readVillaCsv());
        System.out.println("-------------------------");
        for (Room room  : roomList) {
            System.out.println(room.showInformation());
        }
        System.out.println("-------------------------");
        for (House house : houseList) {
            System.out.println(house.showInformation());
        }
        System.out.println("-------------------------");
        for (Villa villa : villaList) {
            System.out.println(villa.showInformation());
        }
        System.out.println("-------------------------");
    }

    @Override
    public void addNewVilla() {
        try {
            String serviceCode = Validation.inputSeviceCode("VL");
            String serviceName = Validation.inputSeviceName();
            double usableArea = Validation.inputArea();
            double rentalCosts = Validation.inputDouble();
            int maxNumberOfPeople = Validation.inputNumberPeople();
            String rentalType = Validation.inputRentalType();
            System.out.println("Enter room Standard: ");
            String roomStandard = sc.nextLine();
            double swimmingPoolArea = Validation.inputArea();
            int numberOfFloors = Validation.inputNumberFloors();
            Villa villa = new Villa(serviceCode, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType, roomStandard, swimmingPoolArea, numberOfFloors);
            List<Villa> villas = new ArrayList<>();
            villas.add(villa);
            write.write(villas,VILLA_PATH,true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addNewRoom() {
        try {
            String codeService = Validation.inputSeviceCode("RO");
            String nameService = Validation.inputSeviceName();
            double usableArea = Validation.inputArea();
            double rentalCost = Validation.inputDouble();
            int numberOfPeople = Validation.inputNumberPeople();
            String rentalType = Validation.inputRentalType();
            System.out.print("Enter the service Free: ");
            String serviceFree = sc.nextLine();
            Room room = new Room(codeService, nameService, usableArea, rentalCost, numberOfPeople, rentalType, serviceFree);
            write.write(room, ROOM_PATH,true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
