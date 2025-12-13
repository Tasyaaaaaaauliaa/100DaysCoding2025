import java.util.Scanner;

public class day97 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int sisi = x.nextInt();
        int hasil = L(sisi);
        System.out.println("luas : "+ hasil);
    }
    public static int L(int sisi){
        return sisi * sisi;
}
}
