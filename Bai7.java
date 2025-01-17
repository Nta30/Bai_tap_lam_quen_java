package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các hàm lượng giác");
        System.out.print("Nhập vào 1 góc: ");
        double x = scanner.nextDouble();
        x = x * Math.PI / 180;
        System.out.printf("Sin(%.2f) = %f\n",x,Math.sin(x));
        System.out.printf("Cos(%.2f) = %f\n",x,Math.cos(x));
        System.out.printf("Tan(%.2f) = %f\n",x,Math.tan(x));
        System.out.printf("Cot(%.2f) = %f\n",x, 1/Math.tan(x));
        scanner.close();
    }
}
