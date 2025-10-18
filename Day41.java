package evalasi;
 import java.util.Scanner;
public class evalasi {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan nama proyek: ");
        String namaProyek = x.nextLine();

        System.out.print("Masukkan panjang tembok (meter): ");
        double panjang = x.nextDouble();

        System.out.print("Masukkan tinggi tembok (meter): ");
        double tinggi = x.nextDouble();

        System.out.print("Masukkan harga cat per liter (Rp): ");
        double hargaPerLiter = x.nextDouble();
        
        double luasTembok = panjang * tinggi;              
        double kebutuhanCat = luasTembok / 12;              
        double totalBiaya = kebutuhanCat * hargaPerLiter;  
        
        
        
        System.out.println("Nama Proyek     : " + namaProyek);
        System.out.println("Luas Tembok     : " + luasTembok + " m2");
        System.out.println("Kebutuhan Cat   : " + kebutuhanCat + " liter");
        System.out.println("Total Biaya Cat : Rp" + String.format("%,.0f", totalBiaya));
        

        
    
    
}
}
