package book;

import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        Book book = new Book("TylandGG", List.of("I", "moved", "here", "recently", "too"));
        BookToFile.printToFile(book);
    }
}
