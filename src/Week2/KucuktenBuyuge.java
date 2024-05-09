package Week2;
import java.util.Arrays;
import java.util.Scanner;
public class KucuktenBuyuge {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Dizinin boyutunu kullanıcıdan al
            System.out.print("Dizinin boyutu n: ");
            int n = scanner.nextInt();

            // Kullanıcıdan elemanları almak için dizi oluştur
            int[] array = new int[n];
            System.out.println("Dizinin elemanlarını giriniz:");

            // Elemanları kullanıcıdan al
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Elemanı: ");
                array[i] = scanner.nextInt();
            }

            // Diziyi küçükten büyüğe sırala
            Arrays.sort(array);

            // Sıralanmış diziyi ekrana bas
            System.out.print("Sıralama: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            
            scanner.close();
        }
}
