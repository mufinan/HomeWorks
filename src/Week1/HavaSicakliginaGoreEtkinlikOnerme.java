package Week1;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı girin: ");
        double sicaklik = scanner.nextDouble();

        if (sicaklik < 5) {
            System.out.println("Öneri: Kayak");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Öneri: Sinema");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Öneri: Piknik");
        } else {
            System.out.println("Öneri: Yüzme");
        }
    }
}
