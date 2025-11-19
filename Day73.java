import java.util.Scanner;

public class day73 {
   public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
          double total = 0;
       double max = 0;
       double min = 0;
       int jmlhAngkaVlid = 0;
        while (true) {
            System.out.print("Masukkan angka(negatif untuk berhenti): ");
            int angka = x.nextInt();

            if (angka < 0) {
                break;
            }
            if (angka == 0){
                System.out.println("angka 0 diabaikan");
                continue;
            }
            
            total += angka;
            jmlhAngkaVlid ++;
            
            if (jmlhAngkaVlid == 1) {
                max = angka;
                min = angka;
            } else {
                if (angka > max) {
                    max = angka;
                }
                if (angka < min) {
                    min = angka;
            
                }            
   }
        }
       if (jmlhAngkaVlid == 0) {
           System.out.println("tidak ada data untuk dihitug");
       } else {
           double rata = total / jmlhAngkaVlid;
        System.out.println("=====hasil======");
        System.out.println("total penjumlahan :" + total);
        System.out.println("jumlah angka valid :" + jmlhAngkaVlid);
        System.out.println("rata rata :" + rata);
        System.out.println("angka maximum :" + max);
        System.out.println("angka minimum : "+ min);
   } 
        }
}
   

