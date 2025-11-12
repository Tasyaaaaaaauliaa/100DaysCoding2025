package day66;
import java.util.Scanner;
public class day66 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("tnggi pola: ");
        int tp = x.nextInt();

        for (int i = 1; i <= tp; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
