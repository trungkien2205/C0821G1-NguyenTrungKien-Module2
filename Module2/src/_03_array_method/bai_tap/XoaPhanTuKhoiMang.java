package _03_array_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        int x = scanner.nextInt();
        int c=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != x) {
                arr[c]=arr[j];
                c++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }
}
