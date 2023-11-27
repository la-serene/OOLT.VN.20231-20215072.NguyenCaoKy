package hust.soict.hedspi.aims.media;

public abstract class Media implements Playable {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {
    }

    public boolean equals(Object o) {
        if (o instanceof Media media)
            return title.equals(media.title);

        return false;
    }
    public void play() {}
    public int getId() { return id; }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
}
