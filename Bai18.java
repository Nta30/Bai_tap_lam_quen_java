package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dãy nhập vào có bao nhiêu phần tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào x: ");
        int x = scanner.nextInt();
        boolean check = false;
        for(int i=0;i<n-1;i++){
            if(arr[i] + arr[i+1] == x){
                check = true;
                System.out.printf("%d và %d\n",arr[i],arr[i+1]);
            }
        }
        if(!check){
            System.out.println("Không có cặp phần tử liên tiếp nào thỏa mãn");
        }
    }
}
