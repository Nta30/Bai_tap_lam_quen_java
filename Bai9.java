package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào x, n: ");
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        int gt = 1;
        double sum = 0;
        for(int i=1;i<=n;i++){
            gt*=i;
            sum+=(double) Math.pow(x,i)/gt;
        }
        System.out.printf("S(%.2f,%d) = %f",x,n,sum);
        scanner.close();
    }
}
