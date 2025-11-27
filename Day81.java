import java.util.Scanner;
public class day81 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Isi array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indeks ke-" + i + ":" + array[i]);
        }
        System.out.print("indeks yang diakses: ");
        int indeks = x.nextInt();
        
        if (indeks >= 0 && indeks < array.length) {
            System.out.println("indeks ke-" + indeks + " adalah: " + array[indeks]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
