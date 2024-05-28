package Week5.KitapSiralayici;
// PageCountComparator sınıfı, kitapları sayfa sayısına göre sıralamak için Comparator arayüzünü uygular.
import java.util.Comparator;

public class PageCountComparator implements Comparator<Book> {
    // compare metodu, kitapları sayfa sayısına göre karşılaştırır.
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getPageCount(), b2.getPageCount());
    }
}
