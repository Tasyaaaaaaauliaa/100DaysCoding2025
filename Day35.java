package day35;
import java.util.Scanner;
public class day35 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("masukan nilai ujian DDP : ");
        int nilai = x.nextInt();
        
        if (nilai > 90){
            System.out.print("Saya tidak mengulang DDP");  
            
        }
    }
}
