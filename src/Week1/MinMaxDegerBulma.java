package Week1;

import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri alınır.
        System.out.print("Kaç tane sayı gireceksiniz:");
        int adet = input.nextInt();
        int buyuk = 0 , kucuk = Integer.MAX_VALUE; //buyuk değişkenine 0, kucuk değişekenine integer tipindeki bir değişkenin alabileceği max value atanır.

        for(int i=1; i<=adet; i++){
            System.out.print(i + ". sayıyı giriniz: "); //Sayılar alınır.
            int sayi = input.nextInt();

            //büyüklük ve küçüklük karşılaştırılır.
            if(sayi > buyuk) buyuk = sayi;
            if(sayi < kucuk) kucuk = sayi;
        }

        System.out.print("En büyük sayı: " + buyuk + "\nEn küçük sayı: " + kucuk);
        input.close();
    }
}
