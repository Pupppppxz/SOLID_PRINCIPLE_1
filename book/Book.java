package book;

import java.util.List;
import java.util.ListIterator;

public class Book implements BookInterface {
    private String title;
    private List<String> pages;
    private ListIterator<String> iterator;
    private String currentPage;

    public Book(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCurrentPage() {
        return currentPage;
    }

    @Override
    public boolean turnToNextPage() {
        if (iterator.hasNext()) {
            currentPage = iterator.next();
            return true;
        } else {
            return false;
        }
    }
}
