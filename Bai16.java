package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử trong dãy số: ");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Dãy số không đủ phần tử để kiểm tra.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử trong dãy số: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
            }
            if (arr[i] >= arr[i - 1]) {
                isDecreasing = false;
            }
        }
        if (isIncreasing) {
            System.out.println("Dãy số tăng");
        } else if (isDecreasing) {
            System.out.println("Dãy số giảm");
        } else {
            System.out.println("Dãy số không tăng và không giảm");
        }
        scanner.close();
    }
}
