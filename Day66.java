package day66;
import java.util.Scanner;
public class day66 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("tinggi pola");
        int tp = x.nextInt();

        for (int i = 1; i <= tp; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
             System.out.println();
        }
    }
}
