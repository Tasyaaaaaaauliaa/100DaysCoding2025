package day56;
import java.util.Scanner;
public class day56 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int angka;

        do {
            System.out.print("masukan angka (1-5) : ");
            angka = x.nextInt();
        } while (angka < 1 || angka > 5);

        System.out.println("angka: " + angka );
    }
}
