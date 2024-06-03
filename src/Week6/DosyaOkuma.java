package Week6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {
        public static void main(String[] args) {
            String dosyaYolu = "C:\\Users\\Public\\Documents\\Sayilar.txt";
            int toplam = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
                String satir;
                while ((satir = br.readLine()) != null) {
                    int sayi = Integer.parseInt(satir);
                    toplam += sayi;
                }
                System.out.println("Dosyadan okunan sayıların toplamı: " + toplam);
            } catch (IOException e) {
                System.err.println("Dosya okuma hatası: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Sayıya dönüştürme hatası: " + e.getMessage());
            }
        }


}
