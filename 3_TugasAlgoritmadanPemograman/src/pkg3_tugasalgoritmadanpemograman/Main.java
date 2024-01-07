
package pkg3_tugasalgoritmadanpemograman;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double rupiah,dolar;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Konversi Mata Uang");
        System.out.print("Rupiah :" );
        rupiah = input.nextDouble();
        dolar = rupiah/13500;
        System.out.println("Dolar :"+dolar);
        

    }
    
}
