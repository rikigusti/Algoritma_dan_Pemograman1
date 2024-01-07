package Sesi5Objek;
public class DemoiFDuaObjek {
    public void checkBilangan(int bilangan) {
        if (bilangan < 0) {
            System.out.println(bilangan + "Merupakan bilangan NEGATIF");
        } else if(bilangan == 0){
            System.out.println("Nilai yang dimasukan adalah NOL");
        }else {
            System.out.println(bilangan +  "Merupakan bilangan POSITIF");
        }
    }
}
