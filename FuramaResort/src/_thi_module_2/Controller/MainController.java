package _thi_module_2.Controller;

import _thi_module_2.Service.IPaymentAccountService;
import _thi_module_2.Service.ISavingAccountService;
import _thi_module_2.Service.impl.PaymentAccountService;
import _thi_module_2.Service.impl.SavingAccountService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        IPaymentAccountService paymentAccountService = new PaymentAccountService();
        ISavingAccountService savingAccountService = new SavingAccountService();
        while (flag) {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÍ TÀI KHOẢN NGÂN HÀNG-");
            System.out.println("1. Thêm Mới");
            System.out.println("2. Xóa ");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng ");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát ");
            System.out.println("Chọn chức năng ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    System.out.println("1. Tài khoản tiết kiệm");
                    System.out.println("2. Tài khoản thanh toán ");
                    System.out.println("Chọn tài khoản ");
                    int choice1=Integer.parseInt(scanner.nextLine());
                    switch(choice1){
                        case 1:
                            savingAccountService.addNewAccount();
                    }
            }
        }
    }
}
