
import java.util.Scanner;

public class perbandingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka genap");
        } else {
            System.out.println("Angka ganjil");
        }

        input.close();
    }
}
