package Week1;

import java.util.Scanner;

public class ArmstrongSayiBul {
    public static void main(String[] args) {

        //Kullanıcıdan veriler alınır.
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();
        int basamakSayisi = 0  , toplam = 0 , basamakdegeri , basamakToplam;
        int temp = number;

        while(temp !=0 ){
            temp /=10;
            basamakSayisi ++;
        }

        temp = number;
        while (temp != 0){
            basamakdegeri = temp % 10;
            basamakToplam = 1;
             for(int i=1; i<=basamakSayisi; i++){
                 basamakToplam *= basamakdegeri;
             }
            toplam += basamakToplam;
            temp /=10;
        }

        if(toplam == number ){
            System.out.println(number + " Armstrong Sayıdır.");
        }else{
            System.out.println(number + " Armstrong Sayı değildir.");
        }
    }
}
