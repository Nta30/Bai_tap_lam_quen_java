package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính R: ");
        double R = scanner.nextDouble();
        double cv = 2 * Math.PI * R;
        double dt = Math.PI * Math.pow(R,2);
        System.out.println("Chu vi hình tròn là: " + cv);
        System.out.println("Diện tích hình tròn là: " + dt);
    }
}
