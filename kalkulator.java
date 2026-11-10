
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       

         System.out.print("Masukkan angka pertama :");
         double a = input.nextDouble();

         System.out.print("Masukkan Operator(+,-,*,/,%) :");
         char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua :");
        double b = input.nextDouble();



        switch(op){

        case '+' :
        System.out.println( a + b );break;
        
        case '-' :
        System.out.println( a - b );break;
        

        case '*' :
        System.out.println( a * b );break;

          case '/' :
            if (b == 0)
                System.out.println("Tidak bisa bagi Nol");
            else
                System.out.println( a / b );
            break;

             case '%' :
            if (b == 0)
                System.out.println("Tidak bisa modulus Nol");
            else
                System.out.println( a % b );
            break;

            default : System.out.println("Operator tidak di kenal");
            }

        



    }

}