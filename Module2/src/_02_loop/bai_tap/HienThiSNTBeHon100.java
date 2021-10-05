package _02_loop.bai_tap;

public class HienThiSNTBeHon100 {
    public static void main(String[] args) {
        int N=2;
        while(N < 100) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }}
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}
