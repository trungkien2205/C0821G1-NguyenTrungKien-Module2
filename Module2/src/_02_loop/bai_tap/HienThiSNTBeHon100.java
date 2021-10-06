package _02_loop.bai_tap;

public class HienThiSNTBeHon100 {
    public static void main(String[] args) {
        int n=2;
        while(n < 100) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }}
            if (check) {
                System.out.println(n);
            }
            n++;
        }
    }
}
