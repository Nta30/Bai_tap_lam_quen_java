package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        //In ra bảng cửu chương từ 2 -> 9
        for(int i=2;i<=9;i++){
            System.out.println("Bảng cửu chương " + i);
            for(int j=1;j<=10;j++){
                System.out.printf("%d * %d = %d\n", i, j, (i*j));
            }
        }
        //In ra bảng cửu chương k
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn in ra bảng cửu chương nào: ");
        int k =scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n", k, i, (k*i));
        }
    }
}
