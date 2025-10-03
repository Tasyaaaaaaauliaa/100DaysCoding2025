package Day26;
import java.util.Scanner;
public class day26 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("masukan nilai a");
       int a = x.nextInt();
        System.out.println("masukan nilai b");
        int b = x.nextInt();
        
        System.out.println("\nNilai awal:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a += b;
        System.out.println("\nsetelah a += b :");
        System.out.println("\n a =" + a);
        
        a -= b;
        System.out.println("\nsetelah a -= b :");
        System.out.println("\n a =" + a);
        
        a *= b;
        System.out.println("\nsetelah a *= b :");
        System.out.println("\n a =" + a);
        
        a /= b;
        System.out.println("\nsetelah a /= b : ");
        System.out.println("\n a =" + a);
        
        a %= b;
        System.out.println("\nsetelah a %= b : ");
        System.out.println("\n a =" + a);
        
        
    }
}

