
import java.util.Scanner;

public class gradelulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa Nilainya? ");
        double nilai = input.nextDouble();

        String grade;

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 55) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Nilai Anda = " + nilai);
        System.out.println("Grade Anda = " + grade);

        
        if(nilai >= 55){
            System.out.println("Status Lulus");
        }else{
            System.out.println("Status Tidak Lulus");
        }
   
        input.close();
    }
}
