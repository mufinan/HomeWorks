package Week1;
import java.util. Scanner;
public class KombinasyonHesaplama {

    public static void main(String[] args) {
        //Kullanıcıdan veriler alınır.
        Scanner scan = new Scanner(System.in);
        System.out.print("n Sayisi: ");
        int n = scan.nextInt();
        System.out.print("r Sayisi: ");
        int r = scan.nextInt();
        int nfak = 1 , rfak = 1 , ffak = 1 ;

        //n! faktöriyel hesaplama
        for (int i = 1; i <= n; i++){
            nfak *= i;
        }

        //r! faktöriyel hesaplama
        for (int i = 1; i <= r; i++){
            rfak *= i;
        }

        //(n - r)! faktöriyel hesaplama
        for (int i = 1; i <= n-r; i++){
            ffak *= i;
        }

        // C(n,r) = n! / (r! * (n-r)!)
        double sonuc = (double) nfak / (rfak * ffak);
    System.out.println("Kombinasyon: " + sonuc);
    }
}
