package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính diện tích hình thang có đáy lớn a, đáy nhỏ b, chiều cao h");
        System.out.println("Nhập vào a, b, h: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double S = (double) 1/2 * (a+b) * h;
        System.out.println("Diện tích hình thang là: " + S);
        scanner.close();
    }
}
