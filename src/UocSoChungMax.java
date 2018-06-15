import java.util.Scanner;

public class UocSoChungMax {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = nhap.nextInt();
        System.out.println("Enter b: ");
        int b =nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a > b) {
            int ucln;
            int i = b;
            while (i > 0) {
                if (a % i == 0 && b % i == 0 && i != 1) {
                    ucln = i;
                    System.out.println("Ước chung lớn nhất là: " + ucln);
                    break;
                } else if (a % i == 0 && b % i == 0 && i == 1) {
                    System.out.println("Không có ước chung");
                    break;
                }
                i--;
            }

        } else {
            int ucln;
            int i = a;
            while (i>0) {
                if (a % i == 0 && b % i == 0 && i != 1) {
                    ucln = i;
                    System.out.println("Ước chung lớn nhất là: " + ucln);
                    break;
                } else if (a % i == 0 && b % i == 0 && i == 1) {
                    System.out.println("Không có ước chung");
                    break;
                }
                i--;
            }
        }





    }
}
