package day47;
import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        System.out.println("masukan nomor hari");
        int hari = x.nextInt();
        switch (hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jum'at");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Nomor hari tidak valid");
            
        }
    }
}

         
