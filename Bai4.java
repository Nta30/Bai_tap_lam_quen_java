package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 2 cạnh của 1 tứ giác vuông: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double cv = (a+b)*2;
        double dt = a*b;
        System.out.println("Chu vi của tứ giác là: " + cv);
        System.out.println("Diện tích của tứ giác là: " + dt);
        scanner.close();
    }
}
