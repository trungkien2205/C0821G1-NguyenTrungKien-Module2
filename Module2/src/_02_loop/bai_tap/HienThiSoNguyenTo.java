package _02_loop.bai_tap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int numbers=20;
        int count=0;
        int N=2;
        while(count < numbers) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }}
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
