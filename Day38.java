package Day38;
import java.util.Scanner;
public class day38 {
    
    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int bilangan = x.nextInt();
        
        if (bilangan > 0) {
            System.out.println("bilangan positif ");
        } else if (bilangan < 0) {
            System.out.println("Bilangan negatif ");
        } else {
            System.out.println("Nol");
        }
        
    }

    }
    
