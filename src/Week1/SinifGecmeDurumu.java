package Week1;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double sum = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            sum += mat;
            count++;
        }

        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            sum += fizik;
            count++;
        }

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            sum += turkce;
            count++;
        }

        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            sum += kimya;
            count++;
        }

        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            sum += muzik;
            count++;
        }

        if (count == 0) {
            System.out.println("Geçerli not girilmedi.");
        } else {
            double average = sum / count;
            if (average < 55) {
                System.out.println("Sınıfta kaldınız, seneye görüşmek üzere.");
                System.out.println("Ortalamanız: " + average);
            } else {
                System.out.println("Sınıfı geçtiniz, tebrikler.");
                System.out.println("Ortalamanız: " + average);
            }
        }
    }
}
