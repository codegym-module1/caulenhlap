import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int num = 2; num <100; num++) {
            int đếm = 1;
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    đếm++;
                }
            }
            if (đếm == 1) {
                System.out.println(num + " là số nguyên tố");
            }
        }
    }
}
