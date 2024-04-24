package Week1;
import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin: ");
        double matematik = not.nextDouble();

        System.out.println("Fizik notunuzu girin: ");
        double fizik = not.nextDouble();

        System.out.println("Kimya notunuzu girin: ");
        double kimya = not.nextDouble();

        System.out.println("Türkçe notunuzu girin: ");
        double turkce = not.nextDouble();

        System.out.println("Tarih notunuzu girin: ");
        double tarih = not.nextDouble();

        System.out.println("Müzik notunuzu girin: ");
        double muzik = not.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not Ortalamanız: " + ortalama);

        // Ortalama 60'dan büyük ise "Sınıfı Geçti", küçük ise "Sınıfta Kaldı" yazdır
        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

        not.close();
    }

}
