package day45;
import java.util.Scanner;
public class day45 {
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        System.out.println("masukan angka");
        int hari = x.nextInt();
        
        switch (hari) {
            case 1:
                System.out.println("hari senin");
                break;
            case 2:
                System.out.println("hari selasa");
                break;
            case 3:
                System.out.println("hari rabu");
                break;
            case 4:
                System.out.println("hari kamis");
                break;
            case 5:
                System.out.println("hari jum'at");
                break;
            case 6:
                System.out.println("hari sabtu");
                break;
            case 7:
                System.out.println("hari minggu");
                break;
            default:
                System.out.println("tidak valid");
            
        }
    }
}

            
