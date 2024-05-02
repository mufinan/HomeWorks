package Week2;

import java.util.Scanner;

public class UsluSayiHesaplama {
    static int usAlma (int taban , int us){
        if (us == 0){ //Eğer üssümüz sıfırsa sonuç bir olacaktır.
            return 1;
        } else {
            return taban * usAlma(taban , us -1); // Girilen üs değeri 1 olana kadar metot devam edecektir.
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Kullanıcıdan verileri alıyoruz.
        System.out.print("Taban değeri giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();

        while (us <0) {
            System.out.println("Lütfen geçerli bir değer giriniz!");
            System.out.print("Üs değerini tekrar giriniz: ");
            us = scan.nextInt();
        }
        System.out.println("Sonuç: " + usAlma(taban , us)); //Yazdığımız metotu çağırarak ekrana bastırıyoruz.
    }
}
