package Week2;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");//Kullanıcıdan sayı alıyoruz.
        int num = scan.nextInt();
        String biriktir = "" , numstr = Integer.toString(num);//Değişkenlerimizi tanımlıyoruz.

        //Alınan sayının basamaklarını tersten string bir değişkende biriktiriyoruz.
        while (num != 0){
            int a = num % 10;
            biriktir += Integer.toString(a);
            num /= 10;
        }
        //Palindrom olup olmadığı kontrol ediliyor.
        if(biriktir.equals(numstr)) System.out.print(numstr + " Palindromdur.");
        else System.out.println(numstr + " Palindrom değildir.");
        scan.close();
    }
}
