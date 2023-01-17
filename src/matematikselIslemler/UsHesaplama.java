package matematikselIslemler;

import java.util.Scanner;

public class UsHesaplama {

    public static void main(String[] args) {

        /*Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        olusturun*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");

        int sayi = scan.nextInt();
        System.out.println("lutfen sayinin usuunu giriniz");
        
        int sayiUssu = scan.nextInt();
        System.out.println(ustHesaplama(sayi,sayiUssu));

    }

    public static double ustHesaplama(int sayi, int us) {
        double sonuc = 1;
        while (!(us == 0)) {
            if (us>=0){
            sonuc *= sayi;
            us--;
            }else {
                sonuc/=sayi;
                us++;
            }


        }
        return sonuc;
    }
}
