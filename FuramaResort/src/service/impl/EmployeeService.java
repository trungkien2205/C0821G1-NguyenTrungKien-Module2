package service.impl;

import common.ReadWriteFile;
import common.Validation;
import models.Employee;
import service.IEmployeeService;

import java.util.*;

public class EmployeeService implements IEmployeeService {
    private static final String EMPLOYEE_PATH = "/Users/nguyentrungkien/Desktop/Module2/FuramaResort/src/data/employee.csv";
    Scanner sc = new Scanner(System.in);
    ReadWriteFile write = new ReadWriteFile();
    ReadWriteFile read = new ReadWriteFile();

    @Override
    public void displayEmployee() {
        List<Employee> employeeList = new ArrayList<>(readFromEmployeeCsv());
        System.out.println("-------------------------");
        for (Employee employee: employeeList) {
            System.out.println(employee.showInformation());
        }
        System.out.println("-------------------------");
    }

    @Override
    public void add() {
        List<Employee> employeeList = read.read(EMPLOYEE_PATH);
        boolean check = true;
        try {
            System.out.print("Enter id employee: ");
            String idEmployee = sc.nextLine();
            for (Employee employee : employeeList) {
                if (employee.getEmployeeId().equals(idEmployee)) {
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
                System.out.println("Enter choice level: \n 1. Trung cấp \n 2. Cao đẳng \n 3. Đại học \n 4. Sau đại học ");
                int choiceLevel = Integer.parseInt(sc.nextLine());
                String level = "";
                switch (choiceLevel) {
                    case 1:
                        level = "Trung câp";
                        break;
                    case 2:
                        level = "Cao đẳng";
                        break;
                    case 3:
                        level = "Đại học";
                        break;
                    case 4:
                        level = "Sau đại học";
                        break;
                    default:
                        System.out.println("No choice");
                }
                System.out.print("Enter position: ");
                String position = sc.nextLine();
                System.out.print("Enter wage: ");
                String wage = sc.nextLine();
                employeeList.add(new Employee(name,birthDay,gender,idCardNumber,phoneNumber,email,idEmployee,level,position,wage));
                write.write(employeeList, EMPLOYEE_PATH, true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void edit() {

        try {
            List<Employee> employeeList = new ArrayList<>(readFromEmployeeCsv());
            System.out.print("Enter id employee: ");
            String employeeId = sc.nextLine();
            for (int i = 0; i< employeeList.size(); i++) {
                if(employeeList.get(i).getEmployeeId().equals(employeeId)){
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    String birthDay = Validation.inputBirthday();
                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter id card number: ");
                    String idCardNumber = sc.nextLine();
                    String phoneNumber = Validation.inputPhone();
                    String email = Validation.inputEmail();
                    System.out.println("Enter choice level: \n 1. Trung cấp \n 2. Cao đẳng \n 3. Đại học \n 4. Sau đại học ");
                    int choiceLevel = Integer.parseInt(sc.nextLine());
                    String level = "";
                    switch (choiceLevel) {
                        case 1:
                            level = "Trung câp";
                            break;
                        case 2:
                            level = "Cao đẳng";
                            break;
                        case 3:
                            level = "Đại học";
                            break;
                        case 4:
                            level = "Sau đại học";
                            break;
                        default:
                            System.out.println("No choice");
                    }
                    System.out.print("Enter position: ");
                    String position = sc.nextLine();
                    System.out.print("Enter wage: ");
                    String wage = sc.nextLine();
                    employeeList.get(i).setFullName(name);
                    employeeList.get(i).setBirthDay(birthDay);
                    employeeList.get(i).setGender(gender);
                    employeeList.get(i).setiDCard(idCardNumber);
                    employeeList.get(i).setPhoneNumber(phoneNumber);
                    employeeList.get(i).setEmail(email);
                    employeeList.get(i).setLevel(level);
                    employeeList.get(i).setPosition(position);
                    employeeList.get(i).setWage(wage);
                    write.write(employeeList,EMPLOYEE_PATH,false);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Employee> readFromEmployeeCsv() {
        List<String[]> strings = new ArrayList<>(read.read(EMPLOYEE_PATH));
        List<Employee> employeeList = new ArrayList<>();
        for (String[] str : strings) {
            Employee employee = new Employee(str);
            employeeList.add(employee);
        }
        return employeeList;
    }
}
