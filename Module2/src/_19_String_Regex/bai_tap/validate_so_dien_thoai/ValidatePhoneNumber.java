package bai_19_string_va_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static boolean validateNumber(String numbers){
        if(!numbers.matches("^\\([0-9]{2}\\)[.-]\\([0][0-9]{9}\\)$")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = "";
        while (!validateNumber(numbers)){
            System.out.println("Nhập số điện thoại: (xx)-(0xxxxxxxxx): ");
            numbers = scanner.nextLine();
        }
    }
}
