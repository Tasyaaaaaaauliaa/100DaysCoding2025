package day48;
import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("Masukan angka 1 : ");
        double angka1 = x.nextDouble();
        System.out.println("Masukan angka 2 : ");
        double angka2 = x.nextDouble();
        System.out.print("masukan operator +, -, *, /, % : ");
        char operator = x.next().charAt(0);
        double hasil;
        
        switch (operator) {
            case '+':
               hasil = angka1 + angka2;
               System.out.println("hasil : "+ hasil);
               break;
            case '-':
               hasil = angka1 - angka2;
               System.out.println("hasil : "+ hasil);
               break;
            case '*':
               hasil = angka1 * angka2;
               System.out.println("hasil : "+ hasil);
               break;
            case '/':
               hasil = angka1 / angka2;
               System.out.println("hasil : "+ hasil);
               break;
            case '%':
               hasil = angka1 % angka2;
               System.out.println("hasil : "+ hasil);
               break;
            default:
               System.out.println("EROR");
    }
}
}
