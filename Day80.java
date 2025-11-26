import java.util.Scanner;
public class day80 {
      public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
          
        System.out.print(" jumlah indeks array: ");
        int n = x.nextInt();

        int[] array = new int[n];

        System.out.println("masukkan indeks array:");
        for (int i = 0; i < n; i++) {
            System.out.print("indeks ke-" + i + ": ");
            array[i] = x.nextInt();
        }
        System.out.println("array yang terinput:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
