package bai_tap_thuc_hanh_java;

public class Bai14 {
    public static void main(String[] args) {
        System.out.println("Các số lẻ không vượt quá 100 là: ");
        for(int i=1;i<100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
