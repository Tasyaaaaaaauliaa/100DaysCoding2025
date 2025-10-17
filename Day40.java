package day40;
import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
   Scanner x = new Scanner(System.in);
        System.out.print("Masukkan angka1: ");
        double angka1 = x.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = x.next().charAt(0);

        System.out.print("Masukkan angka2: ");
        double angka2 = x.nextDouble();
        double hasil;
        
        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Operator tidak dikenal");
        }
    }
    
}
