package day44;
import java.util.Scanner;
public class day44 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukan nilai Mahasiswa");
        double nilai = x.nextDouble();
        
        if (nilai >=90 && nilai <=100){
            System.out.println("Predikat : A");
        } else if (nilai >=80 && nilai <= 89){
            System.out.println("Predikat : B");
        } else if (nilai >=70 && nilai <= 79){
            System.out.println("Predikat : C");
        } else if (nilai >=60 && nilai <= 69){
            System.out.println("Predikat : D");
        } else {
            System.out.println("Predikat : E");
        }
    }
}
