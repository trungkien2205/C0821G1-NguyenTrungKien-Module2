package bai_tap_oop.oop2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long id;
    private String name;
    private double money;
    public static final double INTEREST = 0.035;

    Scanner scanner = new Scanner(System.in);

    public Account() {

    }

    public Account(long id, String name) {
        this.id = id;
        this.name = name;
        this.money = 50;
    }

    public Account(long id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double recharge() {
        double add;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        add = scanner.nextDouble();
        if (add >= 0) {
            money = add + money;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(add);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return add;
    }

    public double withdrawMoney() {
        double fee = 5;
        double whitdraw;
        System.out.print("Nhập số tiền bạn cần rút: ");
        whitdraw = scanner.nextDouble();
        if (whitdraw <= (money - fee)) {
            money = money - (whitdraw + fee);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(whitdraw);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return withdrawMoney();
        }
        return whitdraw;
    }

    public double expire() {
        double laiSuat = 0.035;
        money = money + money * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(money);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return money;
    }

    void displayAccount() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(money);
        System.out.printf("%-10d %-20s %-20s \n", id, name, str1);
    }

}
