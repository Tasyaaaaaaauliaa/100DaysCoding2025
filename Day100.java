import java.util.Scanner;
public class day100 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String cantik = x.nextLine().toLowerCase();
        char[] split = cantik.toCharArray();
        boolean k = false;
        boolean l = false;
        boolean m = false;

        for (int i = 0; i < split.length; i++) {
            if (split[i] == 'i') {
                k = true;
            } else if (k && split[i] == 's') {
                l = true;
            } else if (l && split[i] == 'c') {
                m = true;
                break;
            }
        }

        if (k && l && m) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
