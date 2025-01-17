package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số giây: ");
        int hour,minute;
        int second = scanner.nextInt();
        hour = second/3600;
        second %= 3600;
        minute = second/60;
        second %= 60;
        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}
