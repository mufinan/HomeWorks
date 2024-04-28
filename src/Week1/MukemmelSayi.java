package Week1;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdab veri alınır.
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0, index = sayi - 1;

        //Kendisi hariç olduğu için sayının 1 eksiği ile döngüye başlanır.
        while (index > 0 ) {
            if(sayi%index == 0){ //Şart sağlanıyorsa toplam a eklenir.
                toplam += index;
            }
            index--;
        }
        //Şart sağlanıyorsa ekrana mesaj basılır.
        if(toplam == sayi) System.out.print(sayi + " Mükemmel sayıdır.");
        else System.out.print(sayi + " Mükemmel sayı değildir.");

        scan.close();
    }
}
