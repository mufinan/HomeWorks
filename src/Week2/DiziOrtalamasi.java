package Week2;

public class DiziOrtalamasi {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            double harmonicSeriesSum = 0;

            // Elemanların harmonik serisini hesapla
            for (int i = 0; i < numbers.length; i++) {
                harmonicSeriesSum += 1.0 / numbers[i];
            }

            // Harmonik ortalamayı hesapla
            double harmonicMean = numbers.length / harmonicSeriesSum;

            System.out.println("Harmonik Ortalama: " + harmonicMean);
        }
}
