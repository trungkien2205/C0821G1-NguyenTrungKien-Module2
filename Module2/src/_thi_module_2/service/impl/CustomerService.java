package service.impl;

import common.ReadWriteFile;
import common.Validation;
import models.Customer;
import models.Employee;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final String CUSTOMER_PATH = "/Users/nguyentrungkien/Desktop/Module2/FuramaResort/src/data/customer.csv";
    Scanner sc = new Scanner(System.in);
    ReadWriteFile write = new ReadWriteFile();
    ReadWriteFile read = new ReadWriteFile();

    @Override
    public void displayCustomer() {
        List<Customer> customerList = new LinkedList<>(readFromEmployeeCsv());
        System.out.println("-------------------------");
        for (Customer customer : customerList) {
            System.out.println(customer.showInformation());
        }
        System.out.println("-------------------------");
    }

    @Override
    public void add() {
        List<Customer> customerList = read.read(CUSTOMER_PATH);
        boolean check = true;
        try {
            System.out.print("Enter id employee: ");
            String idCustomer = sc.nextLine();
            for (Customer customer : customerList) {
                if (customer.getCustomerId().equals(idCustomer)) {
                    System.out.print("The id you just entered is already in the list. Next choice:\n");
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                String birthDay = Validation.inputBirthday();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter id card number: ");
                String idCardNumber = sc.nextLine();
                String phoneNumber = Validation.inputPhone();
                String email = Validation.inputEmail();
                System.out.println("Enter choice edit customer type: \n 1. Diamond \n 2. Platinium \n 3. Gold \n 4. Silver \n 5. Member ");
                int choiceCostomerType = Integer.parseInt(sc.nextLine());
                String customerType = "";
                switch (choiceCostomerType) {
                    case 1:
                        customerType = "Diamond";
                        break;
                    case 2:
                        customerType = "Platinium";
                        break;
                    case 3:
                        customerType = "Gold";
                        break;
                    case 4:
                        customerType = "Silver";
                        break;
                    case 5:
                        customerType = "Member";
                        break;
                    default:
                        System.out.println("No choice");
                }
                System.out.println("Enter address :");
                String address = sc.nextLine();
                customerList.add(new Customer(name, birthDay, gender, idCardNumber, phoneNumber, email, idCustomer, customerType, address));
                write.write(customerList, CUSTOMER_PATH, true);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void edit() {
        try {

            List<Customer> customerList = new LinkedList<>(readFromEmployeeCsv());
            System.out.print("Enter id customer: ");
            String customerId = sc.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerId().equals(customerId)) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    String birthDay = Validation.inputBirthday();
                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter id card number: ");
                    String idCardNumber = sc.nextLine();
                    String phoneNumber = Validation.inputPhone();
                    String email = Validation.inputEmail();
                    System.out.println("Enter choice edit customer type: \n 1. Diamond \n 2. Platinium \n 3. Gold \n 4. Silver \n 5. Member ");
                    int choiceCostomerType = Integer.parseInt(sc.nextLine());
                    String customerType = "";
                    switch (choiceCostomerType) {
                        case 1:
                            customerType = "Diamond";
                            break;
                        case 2:
                            customerType = "Platinium";
                            break;
                        case 3:
                            customerType = "Gold";
                            break;
                        case 4:
                            customerType = "Silver";
                            break;
                        case 5:
                            customerType = "Member";
                            break;
                        default:
                            System.out.println("No choice");
                    }
                    System.out.println("Enter address :");
                    String address = sc.nextLine();
                    customerList.get(i).setFullName(name);
                    customerList.get(i).setBirthDay(birthDay);
                    customerList.get(i).setGender(gender);
                    customerList.get(i).setiDCard(idCardNumber);
                    customerList.get(i).setPhoneNumber(phoneNumber);
                    customerList.get(i).setEmail(email);
                    customerList.get(i).setCustomerType(customerType);
                    customerList.get(i).setAddress(address);
                    write.write(customerList, CUSTOMER_PATH, false);
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Customer> readFromEmployeeCsv() {
        List<String[]> strings = new LinkedList<>(read.read(CUSTOMER_PATH));
        List<Customer> customerList = new LinkedList<>();
        for (String[] str : strings) {
            Customer customer = new Customer(str);
            customerList.add(customer);
        }
        return customerList;
    }
}
