import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        int choise;
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("Your choise: ");
        choise = input.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("abcd");
                    System.out.println("xyzt");
                    System.out.println("qưer");
                    break;
                case 2:
                    System.out.println("Draw the triangle");
                    System.out.println("ásdf");
                    System.out.println("fghj");
                    System.out.println("cvbn");
                    break;
                case 3:
                    System.out.printf("Draw the triangle");
                    System.out.println("uiop");
                    System.out.println("cvbn");
                    System.out.println("bnmm");
                    break;
                default:
                    System.out.println("Thoat chuong trinh. ");
                    System.exit(0);
            }
        }
    }
}
