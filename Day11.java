package day11;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nama;
        System.out.println("masukan nama : ");
        nama = scanner.nextLine();
        
        int umur;
        System.out.println("masukan umur : ");
        umur = scanner.nextInt();
        
        boolean biodata;
        System.out.println("masukan keaslian biodata");
        biodata = scanner.nextBoolean();
        
        //Scanner adalah class dari package java.util yang digunakan untuk membaca input dari keyboard.
        //Sebelum menggunakan Scanner, kita harus mengimpor dulu dengan perintah:
        //import java.util.Scanner;
        //kemydian membuat objek scanner yaitu : Scanner scanner = new Scanner (system.in);
        
        
    }
    
}
