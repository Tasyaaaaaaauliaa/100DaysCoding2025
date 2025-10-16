package day39;
import java.util.Scanner;
public class day39 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
         
        System.out.println("Pilih kategori menu:");
        System.out.println("1. Makanan Berat");
        System.out.println("2. Minuman");
        
        System.out.print("Masukkan pilihan kategori (1 dan 2): ");
        
        int kategori = x.nextInt();
        if (kategori == 1){
            
            System.out.println("Menu makanan berat");
            System.out.println("1. Nasi goreng ");
            System.out.println("2. Mie ayam");
            System.out.println("3. ayam geprek");
            System.out.println("makanan apa yang di pesan?");
            int makanan = x.nextInt();
            if (makanan == 1) {
                System.out.println("Nasi Goreng");
            } else if (makanan == 2) {
                System.out.println("Mie Ayam");
            } else if (makanan == 3) {
                System.out.println("Ayam Geprek");
            } else {
                System.out.println("GA ADA");
            }
            System.out.println("_____________________________");
            System.out.println("menu minuman");
            System.out.println("1.Jus jeruk");
            System.out.println("2. es teh");
            System.out.println("3.air putih");
            System.out.println("minuman apa yamg di pesan?");
     
            } else if (kategori == 2) {
                int minuman = x.nextInt();
            }
            int minuman = x.nextInt();
        
            if (minuman == 1){
                System.out.println("Jus jeruk");
            } else if (minuman == 2) {
                System.out.println("es tehh");
            } else if (minuman == 3){
                System.out.println("air putih");
            } else {
                System.out.println("GA ADA JUGA");
                
            }
            }
            }
