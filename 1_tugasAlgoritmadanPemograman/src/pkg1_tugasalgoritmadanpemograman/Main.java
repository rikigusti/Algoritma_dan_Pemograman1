package pkg1_tugasalgoritmadanpemograman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       float p, l, L;
       
       Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas");
        System.out.println("=================");
        
        System.out.print("Masukan Panjang = " );
        p = input.nextInt();
        System.out.print("Masukan Luas    = " );
        l = input.nextInt();
        System.out.println("");
        L = p*l;
        System.out.println("Panjang "+ p);
        System.out.println("Lebar "+ l);
        System.out.println("Luasnya "+ L);
       
    }
    
}
