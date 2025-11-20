import java.util.Scanner;

public class day74 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.println("Makanan: Nasi goreng, mie ayam");
            } else if (pilihan == 2) {
                System.out.println("Minuman: Es teh, Es jeruk");
            } else if (pilihan > 3){
                System.out.println("Menu tidak ada");
            }
        } while (pilihan != 3);

        
    }
}
