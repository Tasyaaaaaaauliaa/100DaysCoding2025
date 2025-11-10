package day64;
import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        double m = scanner.nextDouble();
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        scanner.close();

        double hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= m;
        }

        System.out.println("Hasil " + m + " pangkat " + n + " adalah: " + hasil);
    }
}
