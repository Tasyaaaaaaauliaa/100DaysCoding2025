package day69;
import java.util.Scanner;
public class day69 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("input:");
        int a = x.nextInt();
       for (int i = 1; i <= a; i++) {
         for (int j = 1; j<= i; j++) {
         System.out.print("*");
    }
    System.out.println();
}
}
}
