
import java.util.Scanner;

public class bedasegitiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama:");
        int a = input.nextInt();

        System.out.print("Masukkan sisi kedua:");
        int b = input.nextInt();

        System.out.print("Masukkan sisi ketiga:");
        int c = input.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Panjang sisi harus positif");

        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Bukan Segitiga");

        } else if (a == b && b == c) {
            System.out.println("Segitiga sama sisi");

        } else if (a == b || a == c || b == c) {
            System.out.println("Segitiga sama kaki");

        } else {
            System.out.println("Segitiga sembarang");
        }

        input.close();
    }
}
