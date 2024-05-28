package Week5.KitapSiralayici;

import java.util.Objects;
// Book sınıfı, kitap nesnelerini temsil eder.
// Comparable arayüzünü implement ederek, kitapları isimlerine göre sıralanabilir hale getirir.
public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;
// Constructor ı oluşturuyoruz.
    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }
//Get metotlarını oluşturuyoruz.
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    // Kitapları isimlerine göre sıralamak için compareTo metodu override edilir.
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // equals metodu override edilir, objelerin eşit olup olmadığını kontrol eder.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }

    // hashCode metodu override edilir, nesnenin hash kodunu döndürür.
    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount, author, publicationDate);
    }

    // toString metodu override edilir, nesnenin string temsilini döndürür.
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
