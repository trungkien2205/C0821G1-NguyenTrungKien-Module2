package bai_19_string_va_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class ValidateNameClass {
    public static boolean validateName(String name) {

        if (!name.matches("^[CAP][0-9]{4}[GHIKLM]$")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!validateName(name)) {
            System.out.println("Nhập tên lớp:");
            name = scanner.nextLine();
        }
    }
}

