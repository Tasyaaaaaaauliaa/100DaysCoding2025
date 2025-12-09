import java.util.Scanner;
public class day93 {
     public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         double angka = x.nextDouble();
         
        System.out.println("ceil: " + Math.ceil(angka));
        System.out.println("floor: " + Math.floor(angka));
        System.out.println("round: " + Math.round(angka));
    }
}
