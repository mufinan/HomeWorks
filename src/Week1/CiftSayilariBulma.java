package Week1;

import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {

        int k;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        k = inp.nextInt();
        int toplam = 0;
        int bolum = 0;

        for (int i = 1; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                bolum++;
            }
        }

        double ort = (double) toplam / bolum;
        System.out.println("Ortalama: " + ort);
    }
}
