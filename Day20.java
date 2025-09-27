package Day20;

public class Main {
    
    public static void main(String[] args) {
        //Mengubah Tipe Data Primitif menjadi String
        //1. Menggunakan valueOf()
        int angka = 123;
        String teks = String.valueOf(angka);
        System.out.println("int ke string =" + angka);
        
        //2.Menggunakan toString()
        double desimal = 12.3;
        String teks2 = Double.toString(desimal);
        System.out.println("Double ke string =" + desimal);
        
        //3. Menggunakan operator + dengan string kosong ""
        boolean status = true;
        String teks3 = status + "";
        System.out.println("Boolean ke string =" + teks3);
        
    }
    
}
