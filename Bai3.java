package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = scanner.nextDouble();
        System.out.printf("Tổng của %f và %f là: %f",a,b,a+b);
        scanner.close();
    }
}
