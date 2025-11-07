package dqy61;
import java.util.Scanner;
public class day61 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Nilai N : ");
        int N = x.nextInt();
        System.out.println("Nilai M : ");
        int M = x.nextInt();
        System.out.println("======kelipatan======");
        for (int i = 1; i <= N; i++){
            if (i % M == 0){
                System.out.println(i);
            }
        }
        
    }
    
}
