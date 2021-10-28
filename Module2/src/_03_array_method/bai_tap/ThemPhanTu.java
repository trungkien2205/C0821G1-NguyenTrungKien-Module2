package _03_array_method.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter country.csv: ");
        int num = scanner.nextInt();
        System.out.println("Enter index: ");
        byte index = scanner.nextByte();
        if (index < 0 || index >= array.length - 1) {
            System.out.println("can't add element");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = num;
        }
        for (byte i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
