package Day21;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Masukan nilai a: ");
        int a = y.nextInt();
        
        System.out.print("Masukan nilai b : ");
        int b = y.nextInt();
        
        System.out.println("\nSebelum ditukar :");
        System.out.println("nilai a : "+ a);
        System.out.println("nilai b : "+ b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nSesudah ditukar : ");
        System.out.println("nilai a : " + a);
        System.out.println("nilai b : " + b);
        
        
        
    }
    
}
