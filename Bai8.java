package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh a, b, c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
            double cv = a+b+c;
            double p = cv/2;
            double dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Chu vi của tam giác là: " + cv);
            System.out.println("Diện tích của tam giác là: " + dt);
        }else{
            System.out.println("Không tạo thành tam giác");
        }
        scanner.close();
    }
}
