import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnCokGecenKelime {
    public static void main(String[] args) {
        // Kullanıcıdan metni al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin: ");
        String metin = scanner.nextLine();

        // Metni küçük harfe dönüştür
        metin = metin.toLowerCase();

        // Noktalama işaretlerini kaldır
        metin = metin.replaceAll("[^a-zA-Z ]", "");

        // Kelimeleri ayır
        String[] kelimeler = metin.split(" ");

        // Kelimeleri saklamak için bir HashMap oluştur
        Map<String, Integer> kelimeSayilari = new HashMap<>();

        // Her kelimeyi döngüyle işle
        for (String kelime : kelimeler) {
            // Kelimenin HashMap'te olup olmadığını kontrol et
            if (kelimeSayilari.containsKey(kelime)) {
                // Eğer varsa, count'u bir artır
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);
            } else {
                // Eğer yoksa, kelimeyi HashMap'e ekle ve count'u 1 yap
                kelimeSayilari.put(kelime, 1);
            }
        }

        // En çok geçen kelimenin sayısını bul
        int enCokGecenKelimeSayisi = 0;
        for (int sayi : kelimeSayilari.values()) {
            if (sayi > enCokGecenKelimeSayisi) {
                enCokGecenKelimeSayisi = sayi;
            }
        }

        // En çok geçen kelimenin sayısına sahip tüm kelimeleri bul
        System.out.println("En çok geçen kelimeler:");
        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() == enCokGecenKelimeSayisi) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " kez");
            }
        }

        // Scanner'ı kapat
        scanner.close();
    }
}
