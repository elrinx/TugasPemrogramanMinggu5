
import java.util.Scanner;

public class switc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hari;
        String namaHari;

        System.out.print("Masukkan angka hari (1-7): ");
        hari = input.nextInt();

        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;

            case 2:
                namaHari = "Selasa";
                break;

            case 3:
                namaHari = "Rabu "; 
                break;

            case 4:
                namaHari = "Kamis";
                break;

            case 5:
                namaHari = "Jumat";
                break;

            case 6:
                namaHari = "Sabtu";
                break;

            case 7:
                namaHari = "Minggu";
                break;

            default:
                namaHari = "Hari tidak ditemukan";
        }

        System.out.println(" " + namaHari);

        input.close();
    }
}
