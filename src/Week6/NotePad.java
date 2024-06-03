package Week6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class NotePad {

    private static final String DOSYA_YOLU = "notlar.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // En son kaydedilen metni ekrana yazdır
        String sonMetin = dosyadanOku();
        System.out.println("En son kaydedilen metin: " + sonMetin);

        // Kullanıcıdan metin girişi al
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Metni dosyaya kaydet
        dosyayaYaz(metin);

        scanner.close();
    }

    // Metni dosyaya yazan metod
    private static void dosyayaYaz(String metin) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DOSYA_YOLU))) {
            writer.write(metin);
        } catch (IOException e) {
            System.err.println("Dosyaya yazma hatası: " + e.getMessage());
        }
    }

    // Dosyadan metni okuyan metod
    private static String dosyadanOku() {
        StringBuilder metin = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(DOSYA_YOLU))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                metin.append(satir).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Dosyadan okuma hatası: " + e.getMessage());
        }
        return metin.toString();
    }


}
