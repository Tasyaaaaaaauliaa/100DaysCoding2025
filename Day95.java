import java.util.Scanner;
public class day95 {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
        String nama = x.nextLine();
        int umur = x.nextInt();
        double tinggi = x.nextDouble();
        String biodata = bbiodata(nama, umur, tinggi);
        System.out.println(biodata);
    }
    public static String bbiodata(String nama, int umur, double tinggi){
     return "\n====biodata===="+"\nnama   : "+ nama + "\numur   : "+ umur + "\ntinggi : "+ tinggi;   
}
}
