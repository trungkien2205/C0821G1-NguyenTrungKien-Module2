package review_2.Common;

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

    public static String inputBirthDay(){
        String input = null;
        boolean check = true;
        while (check) {
            System.out.println("Enter birth day YYYY-MM-DD: ");

            input = scanner.nextLine();
            if (!input.matches("\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        return input;
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

    public static String checkExpInYear(){
        String checkexPlnYear = null;
        boolean check = true;
        while (check) {
            System.out.println("Enter year of Experience : ");

            checkexPlnYear = scanner.nextLine();
            if (!checkexPlnYear.matches("[0-9]{1,2}")) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        return checkexPlnYear;
    }

    public static String choiceGraduationRank(){
        String graduationRank=null;

        System.out.println("Choice Graduation Rank");
        System.out.println("1. Excellent");
        System.out.println("2. Good");
        System.out.println("3. Fair");
        System.out.println("4. Poor");
        System.out.println("Enter your choice");
        int choice = Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1 :
                graduationRank = "Excellent";
                break;
            case 2:
                graduationRank = "Good";
                break;
            case 3 :
                graduationRank = "Fair";
                break;
            case 4:
                graduationRank = "Poor";
                break;
        }
        return graduationRank;
    }
}
