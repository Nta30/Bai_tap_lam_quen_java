package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc nhất ax + b = 0");
        System.out.println("Nhập vào 2 số a và b:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.printf("Phương trình vừa nhập là: %.2fx + %.2f = 0\n", a, b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double result = -1 * b / a;
            System.out.printf("Nghiệm của phương trình là: x = %.2f\n", result);
        }
        scanner.close();
    }
}
