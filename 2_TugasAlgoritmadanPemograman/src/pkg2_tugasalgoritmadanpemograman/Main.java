package pkg2_tugasalgoritmadanpemograman;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double pi,keliling,r;
        
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Masukan pi : ");
        pi = scan.nextDouble();
        System.out.print("Masukan r2 : ");
        r = scan.nextDouble();
       
         // membaca dan menyimpan nilai yang dimasukan
         keliling= 2*pi*r;

        System.out.println("\nOUTPUT jari jari lingkaran");
        System.out.println("Masukan nilai pi:"+pi);
        System.out.println("masukan nilai r2:"+r);
        System.out.println("Keliling lingkaran : "+keliling);
        
    }
    
}
