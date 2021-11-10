package common;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
    static Scanner scanner = new Scanner(System.in);

    public static String inputEmail() {
        String checkEmail = null;
        boolean check = true;
        while (check) {
            System.out.println("Enter email: ");

            checkEmail = scanner.nextLine();
            if (!checkEmail.matches("[a-z]+[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+\\.*[a-zA-Z0-9]*)")) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        return checkEmail;
    }
    public static String inputDay() {
        String checkDay = "";
        boolean check = true;
        while (check) {
            System.out.println("Enter day:");
            checkDay = scanner.nextLine();

            if (!checkDay.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(19[0-9][0-9]|20[0-9][0-9])")) {
                System.out.println("No matches");
                System.out.print("Enter again: ");
            } else {
                check = false;
            }
        }
        return checkDay;
    }

    public static String inputBirthday(){
        String birthday = "";
        boolean boole =true;
        while (boole) {
            birthday = inputDay();
            String[] string = birthday.split("/");
            LocalDate today = LocalDate.now();
            int yearNow = today.getYear();
            int age = yearNow - Integer.parseInt(string[2]);
            if (age < 18) {
                System.out.println("Under 18 years old \nEnter again: ");
            }else if(age > 100){
                System.out.println("over 100 years old \nEnter again: ");
            }else{
                boole = false;
            }
        }
        return birthday;
    }

    static public String inputPhone(){
        String input = null;
        boolean check = true;
        while (check) {
            System.out.println("Enter phone : ");
            input = scanner.nextLine();
            if (!input.matches("^\\d{10,11}$")) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        return input;
    }

    public static String inputSeviceName() {
        boolean check = true;
        String name = "";
        while (check) {
            System.out.println("Enter Service Name: ");
            name = scanner.nextLine();
            if (name.matches("^[A-Z][A-z]*")) {
                check = false;
            } else {
                System.out.println("No matches \nEnter name sevice again: ");
            }
        }
        return name;
    }
    public static String inputRentalType() {
        boolean check = true;
        String rentalType = "";
        while (check) {
            System.out.println("Enter RenTal Type (Year|Month|Day|Hour): ");
            rentalType = scanner.nextLine();
            if (rentalType.matches("^(Year|Month|Day|Hour)$")) {
                check = false;
            } else {
                System.out.println("No matches \nEnter name sevice again: ");
            }
        }
        return rentalType;
    }

    public static Double inputArea(){
        boolean check = true;
        double area = 0;
        while (check) {
            try {
                System.out.println("Enter area");
                area = Double.parseDouble(scanner.nextLine());
                if (area > 30) {
                    check = false;
                } else {
                    System.out.println("The area must be more than 30 \nEnter area again: ");
                }
            }catch (Exception e){
                System.out.println("No matches \nEnter area again: ");
            }

        }
        return area;
    }

    public static Integer inputNumberPeople(){
        int number = 0;
        boolean check = true;
        while (check) {
            try {
                System.out.println("Enter max amount people");
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0 && number < 20) {
                    check = false;
                } else {
                    System.out.println("Not found \nEnter again: ");
                }

            } catch (Exception e) {
                System.out.println("No matches \nEnter again: ");
            }
        }
        return number;
    }
    public static Double inputDouble(){

        boolean check = true;
        double money = 0;
        while (check) {
            try {
                money = Double.parseDouble(scanner.nextLine());
                if (money >= 0) {
                    check = false;
                } else {
                    System.out.println("Must be positive \nEnter again: ");
                }
            }catch (Exception e){
                System.out.println("No matches \nEnter again:");
            }

        }
        return money;
    }

    public static Integer inputNumberFloors() {

        boolean check = true;
        int floors = 0;
        while (check) {
            try {
                System.out.println("Enter floors number : ");
                floors = Integer.parseInt(scanner.nextLine());
                if (floors >= 0) {
                    check = false;
                } else {
                    System.out.println("Must be positive \nEnter again: ");
                }
            } catch (Exception e) {
                System.out.println("No matches \nEnter again:");
            }
        }
        return floors;
    }

    public static String inputSeviceCode(String string) {
        boolean check = true;
        String seviceCode = "";
        while (check) {
            System.out.println("Enter Service code");
            seviceCode = scanner.nextLine();
            if (seviceCode.matches("^SV"+string+"-[0-9]{4}$")) {
                check = false;
            } else {
                System.out.println("No matches \nEnter name sevice again: ");
            }
        }
        return seviceCode;
    }
}
