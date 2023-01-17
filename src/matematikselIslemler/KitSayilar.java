package matematikselIslemler;

public class KitSayilar {
    public static void main(String[] args) {
        
        /*
        
        N pozitif bir tamsayı olmak üzere, n sayının pozitif bölenleri toplamı k’dir.
        k < 2n ise n sayısı kıt sayıdır. 

        Örneğin;

        10 sayısını düşünelim. Bu sayının bölenleri: 1, 2, 5 ve 10.

        k = 1+2+5+10 = 18

        2n = 2*10 = 20

        k < 2n olduğu için 10 sayısı, kıt sayı özelliğini taşır.

        1 ile 200 arasindaki kit sayilari bulunuz
        
         */

        int kToplam=0;

        for (int i = 10; i <=50 ; i++) {
            for (int j = 1; j <=i ; j++) {

                if (i%j==0){
                    kToplam+=j;



                }


            }
            if (kToplam<2*i){

                System.out.println(i+ "= kit sayidir");
            }
            kToplam=0;
            
        }
    }
}
