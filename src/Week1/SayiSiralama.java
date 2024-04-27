package Week1;

import java.util.Scanner;

public class SayiSiralama {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan 3 sayıyı al
            System.out.print("Lütfen ilk sayıyı girin: ");
            int sayi1 = scanner.nextInt();
            System.out.print("Lütfen ikinci sayıyı girin: ");
            int sayi2 = scanner.nextInt();
            System.out.print("Lütfen üçüncü sayıyı girin: ");
            int sayi3 = scanner.nextInt();

            // Sayıları küçükten büyüğe sırala
            int enKucuk, orta, enBuyuk;
            if (sayi1 <= sayi2 && sayi1 <= sayi3) {
                enKucuk = sayi1;
                if (sayi2 <= sayi3) {
                    orta = sayi2;
                    enBuyuk = sayi3;
                } else {
                    orta = sayi3;
                    enBuyuk = sayi2;
                }
            } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
                enKucuk = sayi2;
                if (sayi1 <= sayi3) {
                    orta = sayi1;
                    enBuyuk = sayi3;
                } else {
                    orta = sayi3;
                    enBuyuk = sayi1;
                }
            } else {
                enKucuk = sayi3;
                if (sayi1 <= sayi2) {
                    orta = sayi1;
                    enBuyuk = sayi2;
                } else {
                    orta = sayi2;
                    enBuyuk = sayi1;
                }
            }

            // Sıralanmış sayıları ekrana yazdır
            System.out.println("Küçükten büyüğe sıralanmış sayılar:");
            System.out.print(enKucuk + " < ");
            System.out.print(orta + " < ");
            System.out.println(enBuyuk);
        }

}
