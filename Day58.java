package day58;
import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = x.nextInt();

        System.out.println("Angka 1- " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.print("Angka " + n + "-1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
