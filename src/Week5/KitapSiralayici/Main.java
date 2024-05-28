package Week5.KitapSiralayici;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // booksByName adında bir TreeSet oluşturulur.
        // TreeSet, elemanları doğal sıraya (compareTo metodu) göre sıralar.
        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(new Book("Java Programming", 300, "John Doe", "2020"));
        booksByName.add(new Book("Algorithms", 250, "Jane Smith", "2018"));
        booksByName.add(new Book("Data Structures", 200, "Robert Brown", "2019"));
        booksByName.add(new Book("Software Engineering", 350, "Alice Johnson", "2021"));
        booksByName.add(new Book("Database Systems", 400, "Mary Lee", "2017"));

        // Kitaplar isimlerine göre sıralanarak ekrana yazdırılır.
        System.out.println("Books sorted by name:");
        for (Book book : booksByName) {
            System.out.println(book);
        }

        // booksByPageCount adında bir TreeSet oluşturulur.
        // TreeSet, elemanları PageCountComparator'a göre sıralar.
        Set<Book> booksByPageCount = new TreeSet<>(new PageCountComparator());
        booksByPageCount.addAll(booksByName);

        // Kitaplar sayfa sayısına göre sıralanarak ekrana yazdırılır.
        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}
