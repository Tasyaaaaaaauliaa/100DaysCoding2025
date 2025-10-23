package day46;
import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        int harga;
        int total;
        Scanner x = new Scanner (System.in);
        System.out.println("===MENU MINUMAN===");
        System.out.println("1.Matcha Latte  : Rp20.000");
        System.out.println("2.Jus Jeyuk     : Rp15.000");
        System.out.println("3.Jus Alpukat   : Rp12.000");
        System.out.println("4.Alpukat Kocok : Rp12.000");
        System.out.println("Minuman apa yang dipilih?");
        int minuman = x.nextInt();
        switch (minuman) {
            case 1:
                System.out.println("Matcha Latte");
                System.out.println("Berapa yang di pesan?");
                harga = 20000;
                int jumlahpesanan = x.nextInt();
                total = harga * jumlahpesanan;
                System.out.println("Harga    : Rp" + harga);
                System.out.println("Jumlah   : " + jumlahpesanan);
                System.out.println("Total    : Rp" + total);
                break;
            case 2:
                System.out.println("Jus Jeruk");
                System.out.println("Berapa yang di pesan?");
                harga = 15000;
                jumlahpesanan = x.nextInt();
                total = harga * jumlahpesanan;
                System.out.println("Harga    : Rp" + harga);
                System.out.println("Jumlah   : " + jumlahpesanan);
                System.out.println("Total    : Rp" + total);
                break;
            case 3:
                System.out.println("Jus Alpukat");
                System.out.println("Berapa yang di pesan?");
                harga = 12000;
                jumlahpesanan = x.nextInt();
                total = harga * jumlahpesanan;
                System.out.println("Harga    : Rp" + harga);
                System.out.println("Jumlah   : " + jumlahpesanan);
                System.out.println("Total    : Rp" + total);
                break;
            case 4:
                System.out.println("Alpukat Kocok");
                System.out.println("Berapa yang di pesan?");
                harga = 12000;
                jumlahpesanan = x.nextInt();
                total = harga * jumlahpesanan;
                System.out.println("Harga    : Rp" + harga);
                System.out.println("Jumlah   : " + jumlahpesanan);
                System.out.println("Total    : Rp" + total);
                break;
            default:
                System.out.println("Ga ada");
            
        }
    }
}
    
