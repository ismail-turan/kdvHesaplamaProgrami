import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("KDV HESAPLAMA PROGRAMİNA HOS GELDINIZ");
        Scanner imput = new Scanner(System.in);
        System.out.print("Lütfen kdv si hesaplanacak fiyatı giriniz : ");
        double kdvli, fiyat = imput.nextDouble();
        kdvli = fiyat + fiyat * (0.18);
        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV'li Fiyat = " + kdvli);
        System.out.println("KDV tutarı = 1.8");

        /*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak
        KDV tutarı hesaplayan programı yazınız.
         */
        System.out.print("Lütfen kdv'si (şartlı) hesaplanacak fiyatı giriniz : ");
        double kdv, kdvli2, fiyat2 = imput.nextDouble();
        kdv = (fiyat2 > 0 && fiyat2 < 1000) ? 0.18 : 0.08;
        kdvli2=fiyat2+fiyat2*kdv;
        System.out.println("KDV'siz Fiyat = " + fiyat2);
        System.out.println("KDV'li Fiyat = " + kdvli2);
        System.out.println("KDV tutarı = "+kdv);


    }
}