package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private final List<String> authors = new ArrayList<>();
    public Book() { }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public List<String> getAuthors() {
        return authors;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title.trim();
    }
    public void setCategory(String category) {
        this.category = category.trim();
    }
    public void setCost(float cost) {
        this.cost = cost;
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
}
