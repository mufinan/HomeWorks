package Week2;

public class BHarfiYazma {
    public static void main(String[] args) { // "B" harfini oluşturacak çok boyutlu bir diziyi oluşturuyoruz
            String[][] letter = new String[7][4];

            // "B" harfinin oluşturulması
            for (int i = 0; i < letter.length; i++) {
                for (int j = 0; j < letter[i].length; j++) {
                    if (i == 0 || i == 3 || i == 6) {
                        // Üst, orta ve alt kısımlar için yıldız ataması
                        letter[i][j] = " * ";
                    } else if (j == 0 || j == 3) {
                        // Sol ve sağ kısımlar için yıldız ataması
                        letter[i][j] = " * ";
                    } else {
                        // Diğer kısımlar için boşluk ataması
                        letter[i][j] = "   ";
                    }
                }
            }
            // "B" harfinin ekrana yazdırılması
            for (String[] row : letter) {
                for (String col : row) {
                    System.out.print(col);
                }
                System.out.println();
            }
        }
}
