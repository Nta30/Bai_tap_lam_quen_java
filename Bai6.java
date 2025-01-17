package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình ax^2 + bx + c = 0");
        System.out.println("Nhập vào 3 số a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm là:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép là:");
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
        scanner.close();
    }
}
