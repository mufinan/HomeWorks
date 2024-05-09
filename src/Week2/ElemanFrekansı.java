package Week2;
import java.util.HashMap;
public class ElemanFrekansı {
        public static void main(String[] args) {
            int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

            // Her elemanın frekansını tutacak bir HashMap oluşturuyoruz
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            // Dizideki her elemanın frekansını hesaplıyoruz
            for (int num : array) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Frekansları ekrana yazdırıyoruz
            for (int key : frequencyMap.keySet()) {
                int frequency = frequencyMap.get(key);
                System.out.println(key + " sayısı " + frequency + " kere tekrar edildi.");
            }
        }
}
