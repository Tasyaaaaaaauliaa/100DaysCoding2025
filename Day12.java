package day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama = ");
        String nm = scanner.nextLine();
        
        System.out.println("Nama panggilan = " );
        String np = scanner.nextLine();
        
        System.out.println("Alamat = ");
        String almt = scanner.nextLine();
        
        System.out.println("Umur = ");
        int umr = scanner.nextInt();
        
        System.out.print("tanggal lahir = ");
        int tgl = scanner.nextInt();
        
        System.out.print("tinggi badan = ");
        double tb = scanner.nextDouble();
        
        System.out.print("Keaslian biodata = ");
        boolean kbio = scanner.nextBoolean();
    }
    
}
