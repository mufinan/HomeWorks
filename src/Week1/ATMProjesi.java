package Week1;

import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        //default değişkenler tanımlanır.
        int basariliGiris = 3, balance = 5000 , selection;

        loop: while (basariliGiris > 0){ //while döngüsünü "loop" olarak isimlendirdim.
            //Kullanıcı adı ve şifresi alınır.
            System.out.print("Kullanıcı Adınız: ");
            userName = scan.nextLine();
            System.out.print("Parolanız: ");
            password = scan.nextLine();

            //Kullanıcı adı ve şifre kontrol edilir.
            switch (userName + "-" + password) {
                case "patika-dev123": //Kullanıcı adı ve şifre doğru ise;
                    System.out.print("Merhaba, Patika+ Bankasına Hoşgeldiniz!");
                    do {
                        System.out.print("\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkıp yap\nLütfen işlem seçiniz: ");
                        selection = scan.nextInt();

                        switch (selection){
                            case 1:
                                System.out.print("Lütfen yatırmak istediğiniz miktarı giriniz: ");
                                int miktar = scan.nextInt();
                                balance += miktar;
                                break;
                            case 2:
                                System.out.print("Lütfen çekmek istediğiniz miktarı giriniz: ");
                                int miktar1 = scan.nextInt();
                                if(miktar1 > balance) System.out.println("Bakiyeniz yetersiz..");
                                else balance -= miktar1;
                                break;
                            case 3:
                                System.out.println("Mevcut Bakiyeniz: " + balance + "TL'dir.");
                                break;
                        }
                    }while ( selection != 4);
                    System.out.println("İyi günler dileriz :)");
                    //İşlem olarak 4 seçilirse, tek başına break; ile sadece switch yapısından çıkabiliriz, while döngüsünden çıkamayız.
                    //Yukarda while döngüsünü "loop" olarak isimlendirmiştim, break loop; diyerek doğrudan while döngüsünü işaret ederek hedef döngüden çıkıyoruz.
                    break loop;
                default: //Kullanıcı adı ve şifre yanlış ise;
                    basariliGiris--;
                    System.out.println("Kullanıcı adı veya şifre hatalıdır.");
                    switch (basariliGiris){
                        case 0:
                            System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                            break;
                        case 1: case 2:
                            System.out.println("Lütfen tekrar deneyin.\nKalan Hakkınız: " + basariliGiris);
                            break;
                    }
            }
        }
        scan.close();
    }
}
