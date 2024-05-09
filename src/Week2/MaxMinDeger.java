package Week2;
import java.util.Scanner;
public class MaxMinDeger {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Dizinin boyutunu girin: ");
            int size = scanner.nextInt();

            int[] list = new int[size];

            System.out.println("Dizinin elemanlarını girin:");
            for (int i = 0; i < size; i++) {
                System.out.print("[" + (i + 1) + ". eleman]: ");
                list[i] = scanner.nextInt();
            }

            System.out.print("Girilen Sayı: ");
            int inputNumber = scanner.nextInt(); // Kullanıcıdan girilen sayı

            scanner.close();

            int closestSmaller = Integer.MIN_VALUE; // Girilen sayıdan küçük en yakın sayıyı tutacak değişken
            int closestLarger = Integer.MAX_VALUE; // Girilen sayıdan büyük en yakın sayıyı tutacak değişken

            for (int i : list) {
                if (i < inputNumber && i > closestSmaller) {
                    closestSmaller = i;
                }
                if (i > inputNumber && i < closestLarger) {
                    closestLarger = i;
                }
            }

            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        }


}
