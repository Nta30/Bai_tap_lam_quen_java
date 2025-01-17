package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào x: ");
        int x = scanner.nextInt();
        System.out.println("y = " + Math.pow(2,x));
        scanner.close();
    }
}
