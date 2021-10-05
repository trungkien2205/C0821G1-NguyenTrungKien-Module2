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
        int X = scanner.nextInt();
        int index_del = 0;
        int c=0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != X) {
                arr[c]=arr[x];
                c++;
            }
        }
        for (int k = 0; k < arr.length-1; k++) {
            System.out.print(arr[k]);
        }
    }
}
