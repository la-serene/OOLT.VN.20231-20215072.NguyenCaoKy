package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private final List<String> authors = new ArrayList<>();
    private int length;
    public Book() {
        super();
    }
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists!");
        } else {
            authors.add(authorName);
            System.out.println("Add author successfully!");
        }
    }
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Remove author successfully!");
        } else {
            System.out.println("Author does not exist!");
        }
    }
    public String toString() {
        return String.format("Book - %s - %s - %s - %d%n", this.getTitle(), this.getCategory(), this.getAuthors(), this.getLength());
    }
    private List<String> getAuthors() {
        return authors;
    }
    public int getLength() {
        return length;
    }
}
