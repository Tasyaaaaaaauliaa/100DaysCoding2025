import java.util.Scanner;
public class day83 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int angka = x.nextInt();
        int [] array = new int [angka];
        int hasil = 0;
        for (int i = 0; i < angka;i++){
            System.out.print("indeks ke-" + i + ":");
            array [i] = x.nextInt();
            hasil += array [i];
        }
        System.out.print("hasil : "+ hasil);
        
}
}
