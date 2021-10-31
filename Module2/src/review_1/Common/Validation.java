package review_1.Common;

import java.util.Scanner;

public class Validation {
    static Scanner scanner = new Scanner(System.in);

    public static String inputEmail() {
        String checkEmail = "";
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

    public static int inputBirthDay(){
        String input = null;
        boolean check = true;
        while (check) {
            System.out.println("Enter birth day : ");

            input = scanner.nextLine();
            if (input.matches("\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        int checkBirthDay = Integer.parseInt(input);
        return checkBirthDay;
    }

    static public int inputPhone(){
        String input = null;
        boolean check = true;
        while (check) {
            System.out.println("Enter phone (xx)-(0xxxxxxxxx) : ");

            input = scanner.nextLine();
            if (input.matches("^\\([0-9]{2}\\)[.-]\\([0][0-9]{9}\\)$")) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        int checkPhone = Integer.parseInt(input);
        return checkPhone;
    }

    public static int checkExpInYear(){
        int checkexPlnYear = 0;
        boolean check = true;
        while (check) {
            System.out.println("Enter year of Experience : ");

            checkexPlnYear = Integer.parseInt(scanner.nextLine());
            if (checkexPlnYear<0 || checkexPlnYear>100) {
                System.out.println("No matches");

            } else {
                check = false;
            }
        }
        return checkexPlnYear;
    }

    public static String choiceGraduationRank(){
        String graduationRank="";

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
