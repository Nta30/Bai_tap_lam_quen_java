package bai_tap_thuc_hanh_java;

public class Bai10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 36; i++) { // Số gà
            int j = 36 - i; // Số chó
            if (2 * i + 4 * j == 100) {
                System.out.println("Gà: " + i + " Chó: " + j);
            }
        }
    }
}
