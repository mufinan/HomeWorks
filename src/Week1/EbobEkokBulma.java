package Week1;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {

        //Kullanıcıdan veriler alınır.
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int number1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int number2 = scan.nextInt();
        int index, ebob = 1 , ekok;

        //while döngüsü kullandığım ve indexi azaltarak kontrol ettiğim için indexin number1 ya da number2'den başlaması farketmez.
        //Bu durum sadece birim maaliyeti etkiler. Birim maaliyetin az olması için indexe küçük olan sayı atanmalıdır.
        if(number1 > number2) index = number2;
        else index = number1;

        while (index >= 1){
            if(number1%index == 0 && number2%index == 0){ //EBOB şartı kontrol edilir.
                ebob = index;
                break;
            }
            index--;
        }

        //EKOK formülle hesaplanır.
        ekok = number1 * number2 / ebob;
        //Sonuç ekrana bastırılır.
        System.out.print("Girilen sayılar için:\nEBOB: " + ebob + "\nEKOK: " + ekok);
        scan.close();
    }
}
