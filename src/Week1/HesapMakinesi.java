package Week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2; //Kullanıcıdan alacağımız değişkenleri tanımladık.

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan değerleri alıyoruz.
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme"); //Kullanıcıya yapmak istediği işlemi sorduk.
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();
        // Yapılan seçime göre işlemleri hasplatıyoruz.
        switch (select) {
            case 1:
                System.out.println(n1 + n2);

                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
        }
    }
}
