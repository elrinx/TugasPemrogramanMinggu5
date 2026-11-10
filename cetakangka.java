
import java.util.Scanner;

public class cetakangka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan Positif");
        } else if(angka < 0) {
            System.out.println("Bilangan Negatif");
        }else {
            System.out.print("Bilangan Nol");
        }

        input.close();
    }
}
