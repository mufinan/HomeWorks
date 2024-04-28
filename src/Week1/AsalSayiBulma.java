package Week1;

public class AsalSayiBulma {
    public static void main(String[] args){
        //Döngü en küçük asal sayı olan 2den başlatılır.
        for (int i = 2; i <= 100; i++) {
            boolean asalmi = true; //asal kontrolü için bir değişken tanımlanır.
            for (int j = 2; j <= Math.sqrt(i); j++) { // ikinci döngüde ilk döngüdeki sayının karekök ü ne kadar sırayla bölünebilirliği kontrol edilir.
                if (i % j == 0) {  // Eğer bölünebiliyorsa asal değildir.
                    asalmi = false;
                    break;
                }
            }
            if (asalmi) { // asal olan sayılar bastırılır.
                System.out.print(i + " ");
            }
        }
    }
}
