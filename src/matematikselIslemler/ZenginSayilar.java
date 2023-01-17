package matematikselIslemler;

public class ZenginSayilar {
    public static void main(String[] args) {

        /*

        N pozitif bir tamsayı olmak üzere, n sayısının pozitif bölenlerinin toplamı da k’dir.

        Eğer k > 2n ise bu özelliği taşıyan sayılar zengin sayılardır.

        Örneğin;

        12 sayısının pozitif bölenleri: 1 – 2 – 3 – 4 – 6 – 12

        k = 1 + 2 + 3 + 4 + 6 + 12 = 28

        2n = 12*2 = 24 ‘tür.

        k > 2n olduğu için de 12 zengin sayıdır.

         */
        
        int kToplam=0;

        for (int i = 1; i <=50; i++) {
            for (int j = 1; j <=i ; j++) {

                if (i%j==0){
                    kToplam+=j;
                }

                }
            if (kToplam>2*i){
                System.out.println(i+"= zengin sayidir");

            }
            kToplam=0;
            
        }


    }
}
