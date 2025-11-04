package LtihanUKL;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("============= PROGRAM HITUNG FAKTORIAL =============");
        System.out.print("Masukkan sebuah angka : ");
        int angka = input.nextInt();
        long faktorial = 1; // long agar bisa menampung nilai faktorial yang besar
        
        for (int i = 1; i <= angka; i++) {
            faktorial = faktorial * i;
        }
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);

    }
}
