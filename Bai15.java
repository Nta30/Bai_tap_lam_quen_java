package bai_tap_thuc_hanh_java;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm của học sinh (0-10): ");
        double diem = scanner.nextDouble();
        if (diem < 0 || diem > 10) {
            System.out.println("Điểm không hợp lệ. Vui lòng nhập điểm trong khoảng từ 0 đến 10.");
        } else {
            if (diem < 5) {
                System.out.println("Học lực: Yếu");
            } else if (diem >= 5 && diem < 6) {
                System.out.println("Học lực: Trung bình");
            } else if (diem >= 6 && diem < 7) {
                System.out.println("Học lực: Trung bình khá");
            } else if (diem >= 7 && diem < 8) {
                System.out.println("Học lực: Khá");
            } else if (diem >= 8 && diem < 9) {
                System.out.println("Học lực: Giỏi");
            } else {
                System.out.println("Học lực: Xuất sắc");
            }
        }
        scanner.close();
    }
}
