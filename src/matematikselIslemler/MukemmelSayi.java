package matematikselIslemler;

public class MukemmelSayi {
    public static void main(String[] args) {

        /*
            Kendisi hariç bütün pozitif bölenlerinin toplamı,
            kendisine eşit olan sayılara mükemmel sayılar denir. Örneğin;

            6 sayısının bölenleri: 1 + 2 + 3 = 6

            28 sayısının bölenleri: 1 + 2 + 4 + 7 + 14 = 28




            Şimdi 1 ile 1000 arasındaki mükemmel sayıları bulacağız. Java kodlarımız:

         */

        int toplam = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    toplam += j;

                    if (toplam == i) {
                        System.out.println(i+"= mukemmel sayidir");
                    }


                }

            }

            toplam = 0;


        }

    }
}

