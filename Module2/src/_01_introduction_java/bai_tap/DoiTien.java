package _01_introduction_java.bai_tap;


import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        int rate=23000;
        int usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = scanner.nextInt();
        int vnd;
        vnd=usd*rate;
        System.out.println("VND :"+vnd);
    }
}
