package contoh1;
import java.util.Scanner;
public class Contoh1 {

    public static void main(String[] args) {
        double solar, premium, pertalite, pertamax, turbo, uang, hasil;
        int jenis;
        
        System.out.println("=============Pom Bensin=============");
        System.out.println("1.Solar          = Rp.4.500/liter");
        System.out.println("2.Premium        = Rp.6.500/liter");
        System.out.println("3.Pertalite      = Rp.7.500/liter");
        System.out.println("4.Pertamax       = Rp.8.500/liter");
        System.out.println("5.Pertamak Turbo = Rp.9.500/liter");
        System.out.println("=====================================");
        
       Scanner input = new Scanner(System.in);
       System.out.print("Masukan Tipe Bensin : ");
       jenis = input.nextInt();
       
       System.out.print("Masukan Uang : Rp. ");
       uang = input.nextDouble();
       
       if(jenis == 1){
           if (uang>=4500) {
               hasil = uang/4500;
                       System.out.println("Rp."+uang+" Mendapatkan bensin" +hasil+" /Liter");
                       System.out.println("==============================================");        
                       System.out.println("uang yang anda kasih"+uang);
                       System.out.println("==============================================");   
           } else {
                System.out.println("Uang anda kurang");   
           }
       }
    }
    
}
