package Week1;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = inp.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        double yas = inp.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = inp.nextInt();

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) { //Hatalı veri kontrolü.
            double normalTutar = mesafe * 0.10;
            double indirimliTutar;

            //Yaş indirimleri.
            if ( yas<12 ) {
                indirimliTutar = normalTutar * 0.5 ;
            } else if ( yas>=12 && yas<=24 ){
                indirimliTutar = normalTutar * 0.9 ;
            } else if ( yas>65 ) {
                indirimliTutar = normalTutar * 0.7 ;
            } else {
                indirimliTutar = normalTutar;
            }

            //Yolculuk tipi indirimi.
            if ( tip == 2 ) {
                indirimliTutar = (indirimliTutar * 0.8 ) * 2;
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
