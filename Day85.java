import java.util.Scanner;

public class dayy85 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("jumlah elemen array: ");
        int n = x.nextInt();
        
        System.out.print("elemen ke-1: ");
        int max = x.nextInt();
        
        for (int i = 1; i < n; i++) {
            System.out.print("elemen ke-" + (i + 1) + ": ");
            int angka = x.nextInt();
            if (angka > max) {
                max = angka;
            }
        }
        
        System.out.println("angka maksimal : " + max);
    }
}
