package Week2;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void toplama() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void carpma() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void us() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Modu alınacak sayıyı giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println(" Kaça göre modu :");

        int sayi2 = scan.nextInt();
        int sonuc = sayi1 % sayi2;
        System.out.println("Sonuç : " + sonuc);

    }

    static void alancevre(){
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz :");
        int ilkkenar = scan.nextInt();
        System.out.print("İkinci kenarı giriniz :");
        int ikincikenar = scan.nextInt();

        double alan = ilkkenar * ikincikenar;
        double cevre = 2 * (ilkkenar + ikincikenar);
        System.out.println("Dikdörtgen alanı: " + alan );
        System.out.println("Dikdörtgen çevresi: " + cevre );

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alancevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
