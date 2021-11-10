package controller;

import service.*;
import service.impl.*;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    IService service = new Service();
    IContractService contractService = new ContractService();
    IBookingService bookingService = new BookingService();
    ICustomerService customerService = new CustomerService();
    IEmployeeService employService = new EmployeeService();
    IFacilityService facilityService = new FacilityService();

    public void displayMainMenu() {
        do {
            System.out.println("Main Menu :\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Display list Employee\n" +
                            "2.Add new Employee\n" +
                            "3.Edit Employee\n" +
                            "4.Return Main Menu\n" +
                            "Enter your choice:");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            employService.displayEmployee();
                            break;
                        case 2:
                            employService.add();
                            break;
                        case 3:
                            employService.edit();
                            break;
                        case 4:
                            displayMainMenu();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.Display list Customer\n" +
                            "2.Add new Customer\n" +
                            "3.Edit Customer\n" +
                            "4.Return Main Menu\n" +
                            "Enter your choice:");
                    int choice2= Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1:
                            customerService.displayCustomer();
                            break;
                        case 2:
                            customerService.add();
                            break;
                        case 3:
                            customerService.edit();
                            break;
                        case 4:
                            displayMainMenu();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1.Display list Facility\n" +
                            "2.Add new Facility\n" +
                            "3.Display list Facility maintenance \n" +
                            "4.Return Main Menu\n" +
                            "Enter your choice:");
                    int choice3= Integer.parseInt(scanner.nextLine());
                    switch (choice3){
                        case 1:
                            facilityService.showListFacility();
                        case 2:
                            System.out.println("1.Add New Villa\n" +
                                    "2.Add new House\n" +
                                    "3.Add new Room \n" +
                                    "4.Return Main Menu\n" +
                                    "Enter your choice:");
                            int choiceAdd= Integer.parseInt(scanner.nextLine());
                            switch(choiceAdd){
                                case 1:
                                    facilityService.addNewVilla();
                                    break;
                                case 2:
                                    facilityService.addNewRoom();
                                    break;
                            }
                    }
                    break;
                case 4:
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking \n" +
                            "3.Create new contracts \n" +
                            "4.Display list contracts\n" +
                            "5.Edit contract \n"+
                            "6.Return Main Menu\n"+
                            "Enter your choice:");
                    break;
                case 5:
                    System.out.println("1.Display list customer use service\n" +
                            "2.Display list customer get voucher\n" +
                            "3.Return Main Menu \n"+
                            "Enter your choice:");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("---Out of range (1 -> 6), try again ---");
            }
        } while (true);
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
