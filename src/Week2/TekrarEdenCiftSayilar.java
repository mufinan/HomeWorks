package Week2;
import java.util.HashMap;
public class TekrarEdenCiftSayilar {
        public static void main(String[] args) {
            int[] numbers = {2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};

            // Her sayının kaç kez tekrar ettiğini takip etmek için bir HashMap oluşturuyoruz
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            // Dizideki her sayının tekrar sayısını hesaplıyoruz
            for (int number : numbers) {
                if (number % 2 == 0) { // Sayı çiftse işleme devam ediyoruz
                    // Sayının tekrar sayısını güncelliyoruz
                    frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
                }
            }

            // Çift sayılar arasında tekrar edenleri belirliyoruz
            System.out.println("Tekrar eden çift sayılar:");
            for (int number : frequencyMap.keySet()) {
                int frequency = frequencyMap.get(number);
                if (frequency > 1) {
                    System.out.println(number + " (Tekrar Sayısı: " + frequency + ")");
                }
            }
        }
}
