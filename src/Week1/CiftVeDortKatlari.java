package Week1;

import java.util.Scanner;

public class CiftVeDortKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k, toplam = 0;

        do {
            System.out.println("Sayı Giriniz: ");
            k = inp.nextInt();
            if (k % 4 == 0){
                toplam += k;
            }

        } while (k % 2 == 0 );
        System.out.println("Toplam : " + toplam);
    }
}
