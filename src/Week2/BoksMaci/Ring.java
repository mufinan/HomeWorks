package Week2.BoksMaci;

import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        decideFirstAttacker(); // İlk dövüşçüyü belirle

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    // İlk dövüşçüyü belirle
    public void decideFirstAttacker() {
        Random random = new Random();
        int randomNumber = random.nextInt(100); // 0 ile 99 arasında rastgele bir sayı
        if (randomNumber < 50) {
            System.out.println(f1.name + " ilk saldıran!");
        } else {
            System.out.println(f2.name + " ilk saldıran!");
            // Dövüşçülerin yerini değiştir
            Fighter temp = f1;
            f1 = f2;
            f2 = temp;
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan: " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can: " + f1.health);
        System.out.println(f2.name + " Kalan Can: " + f2.health);
    }

}
