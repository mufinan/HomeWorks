package Week1;

import java.util.Scanner;

public class YildizlaElmasYapma {
    public static void main(String[] args) {

        //Kullanıcıdan veri alınır.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı Giriniz: ");
        int number = scan.nextInt();

        //üçgen çiziyoruz
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number-i; j++) System.out.print(" ");
            for(int j=1; j<=2*i-1; j++) System.out.print("*");
            System.out.print("\n");
        }
        //Aynı döngüyü tersten dönerek tersten üçgen çiziyoruz, burada number-2 den başlatmamızın nedeni fazladan *'lı satır basmaması içindir.
        for(int i=number-1; i>=1; i--){
            for(int j=1; j<=number-i; j++) System.out.print(" ");
            for(int j=1; j<=2*i-1; j++) System.out.print("*");
            System.out.print("\n");
        }
        scan.close();
    }
}
