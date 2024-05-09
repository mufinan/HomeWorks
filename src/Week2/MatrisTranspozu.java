package Week2;
import java.util.Scanner;
public class MatrisTranspozu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Matris boyutlarını kullanıcıdan al
            System.out.print("Matrisin satır sayısını girin: ");
            int rows = scanner.nextInt();
            System.out.print("Matrisin sütun sayısını girin: ");
            int cols = scanner.nextInt();

            // Matrisi oluştur
            int[][] matrix = new int[rows][cols];

            // Kullanıcıdan matrisi al
            System.out.println("Matrisin elemanlarını girin:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("[" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Matrisin transpozunu al ve ekrana bas
            System.out.println("Transpoze:");
            for (int j = 0; j < cols; j++) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            scanner.close();
        }
}
