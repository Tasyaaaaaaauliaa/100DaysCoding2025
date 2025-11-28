import java.util.Scanner;
public class day82 {
    public static void main(String[] args) {
       Scanner x = new Scanner (System.in);
        System.out.print("Masukan jumlah elemen array :  ");
        int jmlh = x.nextInt();
        
        int [] array = new int [jmlh];
        
        for (int i = 0; i < jmlh; i++){
            System.out.print("Masukan elemen ke-"+ (i + 1)+ ":");
            int in = x.nextInt();
            
            if (in < 0 && array [i] == 0){
            } else {
                array [i] = in;
            }
        }
        System.out.println("====Isi Array====");
         int total = 0;
         int jmlnol = 0;
         for (int i = 0; i < jmlh; i++) {
            System.out.println("Indeks " + i + ": " + array[i]);
            total += array[i];
            if (array[i] == 0) {
                jmlnol++;
            }
        }
        double rataRata = total / jmlh;
        System.out.println("Total nilai array : " + total);
        System.out.println("Rata-rata nilai   : " + rataRata);
        System.out.println("Jumlah nilai nol  : " + jmlnol);
    
}
}

        
        
