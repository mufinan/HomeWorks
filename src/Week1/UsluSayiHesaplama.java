package Week1;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        //Kullanıcıdan veriler alınır.
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scan.nextInt();
        System.out.print("Kuvvetini Giriniz: ");
        int n = scan.nextInt();

        long sonuc = 1;

        //n kere, sayi değeri kendisiyle çarpılıp sonuc a yazılır.
        for(int i=1; i<=n; i++){
            sonuc *= sayi;
        }

        System.out.println("Sonuc : " + sonuc);
    }
}
