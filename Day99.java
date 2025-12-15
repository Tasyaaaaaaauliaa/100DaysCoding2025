import java.util.Scanner;
public class day99 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("nilai n: ");
        int n = x.nextInt();

        System.out.print("deretan bilangan prima: ");
        for (int i = 2; i <= n; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean prima(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
