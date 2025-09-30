package Day23;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       Scanner x = new Scanner (System.in); 
        
        System.out.print("Masukan panjang:");
        double panjang = x.nextDouble();
        
        System.out.print("Masukan lebar:");
        double lebar = x.nextDouble();
        
        double luas = panjang * lebar;
        
        System.out.print("Hasil luas persegi:" + luas);
       
    }
    
}
