package Week1;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Kullanıcıdan veri alınır.
        System.out.print("Basamak Sayısını Girin: ");
        int basamak = scan.nextInt();

        //Basamak sayısı kadar döngü açılır.
        for (int i=basamak; i>=1; i--){
            //her turda i 1 azaldığı için ikinci döngüde i'ye kadar yıldız yan yana bastırılır.
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            //alt satıra geçilir.
            System.out.print("\n");
        }

        scan.close();
    }
}
