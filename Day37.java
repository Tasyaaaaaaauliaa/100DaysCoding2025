package day37;
import java.util.Scanner;
public class Day37 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.print("masukan bilangan : ");
        int bilangan = x.nextInt();
        
        if (bilangan % 2 == 0){
            System.out.print("bilangan genap");
        } else {
            System.out.print("bilangan ganjil");
     
        }
    }
    
}
