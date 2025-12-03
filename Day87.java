import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.print("Cari angka: ");
        int cari = x.nextInt();
        
        boolean ket = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == cari) {
                System.out.println("Ditemukan di index: "+i);
                ket = true;
                break;
            }
        }
        if (!ket) {
            System.out.println("Tidak ditemukan");
        }
    }
    

}
