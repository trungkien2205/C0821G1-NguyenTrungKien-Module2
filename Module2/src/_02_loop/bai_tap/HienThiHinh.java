package _02_loop.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                for(int i=0;i<3;i++){
                    for (int j=0;j<=10;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i=0; i<=5; i++){
                    for(int j=0; j<i; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for(int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
        }
    }
}
