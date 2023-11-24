package hust.soict.hedspi.aims.media;

public class Disc extends Media implements Playable {
    private int length;
    private String director;
    public Disc() {
        super();
    }
    public void play() {

    }
    public void getLength(int length) {
        this.length = length;
    }
    public int setLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
}
