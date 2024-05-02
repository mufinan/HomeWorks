package Week2;

import java.util.Scanner;

public class AsalSayiMi {
    // Recursive olarak asal sayı kontrolü
    static boolean asalMi(int sayi, int bolen) {
        if (bolen <= 1) // Bölenimiz 1 e eşit yada küçük olduğu durumlarda asal sayı şartını sağlar.
            return true;
        if (sayi % bolen == 0) //Sayımızın bölene karşı modu sıfırsa asal değildir.
            return false;
        return asalMi(sayi, bolen - 1); //Bölenimizi 1 olana kadar bir nevi döngüye sokmuş oluyoruz
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 2)
            System.out.println(sayi + " bir asal sayı değildir.");
        else if (asalMi(sayi, sayi / 2))
            System.out.println(sayi + " bir asal sayıdır.");
        else
            System.out.println(sayi + " bir asal sayı değildir.");

        scanner.close();
    }
}



