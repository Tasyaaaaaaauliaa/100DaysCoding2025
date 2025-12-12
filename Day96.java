import java.util.Scanner;

public class day96 {
    
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int a = x.nextInt();
        int b = x.nextInt();
        System.out.println("tambag : " + t(a, b));
        System.out.println("kurng : " + k(a, b));
        System.out.println("kali : " + ka(a, b));
        if (b == 0) {
            System.out.println("Pembagian : Error");
        } else {
            System.out.println("Pembagian : " + (double) a / b);
        }
    }

    public static int t(int a, int b) {
        return a + b;
    }

    public static int k(int a, int b) {
        return a - b;
    }

    public static int ka(int a, int b) {
        return a * b;
    }
}
