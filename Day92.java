import java.util.Scanner;

public class day92 {
public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        int h = t(a, b);
        System.out.println("Hsil : " + h);
    
    }

    public static int t(int a, int b) {
        return a + b;
    }
}
