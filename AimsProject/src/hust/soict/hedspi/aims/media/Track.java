package hust.soict.hedspi.aims.media;

public record Track(String title, int length) implements Playable {
    public void play() {
        System.out.println("Playing Track: " + this.title());
        System.out.println("Track length: " + this.length());
    }
}