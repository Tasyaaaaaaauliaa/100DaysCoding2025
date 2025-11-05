package day59;
   import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
       System.out.println("nilai n : ");
        int n = x.nextInt();
       
        System.out.println("angka genap ");
        for (int i = 1; i <=n; i++){
             if (i % 2 == 0){
                System.out.println(i+ " ");
            }
        }
        System.out.println("angka ganjil");
        for (int i = 1; i <=n; i++){
             if (i % 2 != 0){
                System.out.println(i+ " ");
            }
       
       }
       
    }
}
