import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Không phải số nguyên tố");
        } else {
            int x = 0;
            int i = num - 1;
            while (i > 1) {
                if (num % i == 0) {
                    x++;
                } else {
                    x = x;
                }
                i--;
            }
            if (x != 0) {
                System.out.println("Không phải số nguyên tố");

            } else {
                System.out.println("Đây là số nguyên tố");

        }

        }
    }


}
