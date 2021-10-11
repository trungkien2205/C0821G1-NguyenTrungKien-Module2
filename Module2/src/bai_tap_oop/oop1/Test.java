package bai_tap_oop.oop1;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    static void inputCar(Vehicle car) {
        System.out.print("Nhập dung tích xe: ");
        car.setCapacity(scanner.nextInt());
        System.out.print("Nhập trị giá xe: ");
        car.setPrice(scanner.nextInt());
        ;
        scanner.nextLine();
    }

    public static void main(String[] args) {

        Vehicle list[] = null;
        int num, n;
        boolean check = true;
        do {
            System.out.println("1. Tạo các đối tượng và nhập thông tin");
            System.out.println("2. Xuất bản kê khai tiền thuế các xe ");
            System.out.println("3. Thoát ");
            System.out.println("Chọn : ");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n = scanner.nextInt();
                    list = new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i + 1));
                        list[i] = new Vehicle();
                        inputCar(list[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.length; i++) {
                        System.out.println(list[i].toString() +" VAT : "+ list[i].getVat());
                    }
                    break;
                case 3:
                    check = false;
                    break;

            }
        } while (check);
    }
}
