package Week5;

public class TryCatch {
    // Diziyi manuel olarak tanımlıyoruz
    private static final int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public static void main(String[] args) {
        // Örnek indeks değerleri
        int[] indices = {2, 5, 10, -1};

        // Her indeks için metodu çağır ve sonucu yazdır
        for (int index : indices) {
            System.out.println("Index " + index + ": " + getElementAtIndex(index));
        }
    }

    // Belirtilen indeksteki elemanı döndüren metod
    public static String getElementAtIndex(int index) {
        try {
            // Diziden elemanı al ve döndür
            int element = array[index];
            return String.valueOf(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata mesajını döndür
            return "Error: Index " + index + " is out of bounds.";
        }
    }


}
