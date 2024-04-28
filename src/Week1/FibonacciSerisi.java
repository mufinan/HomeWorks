package Week1;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan eleman sayısı alınır.
        System.out.print("Eleman sayısını giriniz: ");
        int eleman = scan.nextInt();
        int eski = 0, yeni = 1;

        //ilk 2 eleman bastırılır.
        System.out.print(eski + " " + yeni + " ");

        //2'den itibaren Fibonacci kuralı işletilir.
        for (int i = 2; i <= eleman; i++) {
            int toplam = eski + yeni;
            System.out.print(toplam + " ");
            eski = yeni;
            yeni = toplam;
        }
        scan.close();
    }
}
