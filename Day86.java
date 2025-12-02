import java.util.Scanner;
public class day86 {
     public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("jumlah elemen array: ");
        int n = x.nextInt();
        
        System.out.print("elemen ke-1: ");
        int min = x.nextInt();
        
        for (int i = 1; i < n; i++) {
            System.out.print("elemen ke-" + (i + 1) + ": ");
            int angka = x.nextInt();
            if (angka < min) {
                min = angka;
            }
        }
        
        System.out.println("angka minimal : " + min);
    }
}
