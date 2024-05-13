package Week2;

import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        printNumbers(n);
        scanner.close();
    }

    public static void printNumbers(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        printNumbers(n - 5);
        System.out.print(n + " ");
    }
}
