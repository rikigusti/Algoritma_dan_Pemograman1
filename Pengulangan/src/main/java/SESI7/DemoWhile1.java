package SESI7;
public class DemoWhile1 {
    public static void main(String[] args) {
        int n = 5; //5 Bilangan Positif pertama
        int hasil = 0;
        int i=1;
        while (i <= n ) {            
            System.out.print(i);
            if (i != n) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
            hasil += 1;
            i++;
        }
        System.out.println(hasil);
    }
}
