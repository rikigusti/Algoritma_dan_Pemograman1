package SESI7;
public class DemoForPrima {
    public static void main(String[] args) {
        int bilangan = 7;
        boolean prima =true ;
        for (int i = 2; i <= (bilangan/2); i++) {
            if ((bilangan % i) == 0) {
                prima= false;
                break;
            }
            if (prima) {
                System.out.println(bilangan + " Merupakan Bilangan Prima ");
            } else {
                System.out.println(bilangan + " Bukan Bilangan Prima ");
            }
        }
    }
}
