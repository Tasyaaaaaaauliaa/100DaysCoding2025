package day31;
import java.util.Scanner;
public class day31 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        System.out.println(a < b && b > c);
        
    }
    
}
