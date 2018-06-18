import java.util.Scanner;

public class HienThi20SoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can hien thi");
        int num = scanner.nextInt();
        int đếm = 0;

        int n = 2;

        while (đếm < num) {
            int x = 1;
            for (int i = n - 1; i > 1; i--) {
                if (n % i == 0) {
                    x++;
                }
            }
            if (x == 1) {
                System.out.println(n + " là số nguyên tố");
                đếm++;
            }
            n++;
        }
    }
}
