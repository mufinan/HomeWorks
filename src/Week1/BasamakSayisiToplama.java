package Week1;

import java.util.Scanner;

public class BasamakSayisiToplama {
    public static void main(String[] args) {

        //Kullanıcıdan veriler alınır.
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();
        int toplam = 0;

        //1'ler basamağından başlayıp son basamağa kadar döngü açılır.
        while (number != 0){
            toplam += number % 10;
            number /=10;
        }

        System.out.println("Girilen sayının basamaklar toplamı : " + toplam);
        scan.close();
    }
}
