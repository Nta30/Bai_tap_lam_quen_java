package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số phần tử của mảng là: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        boolean check = false;
        System.out.println("Các phần tử trong mảng là số hoàn hảo: ");
        for(int i=0;i<array.length;i++){
            if (isPerfectNumber(array[i])){
                check = true;
                System.out.printf("%d ",array[i]);
            }
        }
        if(!check) System.out.println("Không có!");
    }
    static boolean isPerfectNumber(int n){
        if(n<=1) return false;
        int sum = 1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i==Math.sqrt(n)){
                    sum+=i;
                }else{
                    sum+=i+n/i;
                }
            }
        }
        if(sum == n) return true;
        else return false;
    }
}
