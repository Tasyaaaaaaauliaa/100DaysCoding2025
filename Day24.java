package Day24;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Masukan jari-jari: ");
        double r = t.nextDouble();
        
        Double luas = Math.PI * r * r;
        
        System.out.print("Luas lingkaran dengan jari-jari " + r + "adalah "+ luas);
    }
    
}
