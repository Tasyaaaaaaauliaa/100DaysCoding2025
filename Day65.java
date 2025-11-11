package day65;
import java.util.Scanner;
public class day65 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int n = scanner.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println( "nilai dari "+ n + "! adalah: " + faktorial);
    }
}
