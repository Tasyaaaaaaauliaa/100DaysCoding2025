package Day33;
import java.util.Scanner;
public class day33 {
      public static void main(String[] args) {
            
        Scanner x = new Scanner (System.in);
        System.out.print("Masukan nilai a : ");
        int a = x.nextInt();
        System.out.print("Masukan nilai b : ");
        int b = x.nextInt();
            
        boolean hasil =  (a > b);
        System.out.println("hasil operator : " + hasil);
        System.out.println("hasil operator not (!) : " + !hasil);
      }
}
