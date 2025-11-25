
import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String username = "";
        String password = "";
        
        System.out.println("Buat Akun");
        System.out.print("Masukkan username: ");
        username = x.nextLine();
        System.out.print("Masukkan password: ");
        password = x.nextLine();
      
        boolean loginBerhasil = false;
        while (!loginBerhasil) {
            System.out.println("Login ke Akun");
            System.out.print("Masukkan username: ");
            String inputUsername = x.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = x.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil");
                loginBerhasil = true;
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.");
            }
        }
    }
}
