package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private final String title;
    private final int length;
    public Track(String title, int length) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank!");
        } else this.title = title;

        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive!");
        } else this.length = length;
    }
    public boolean equals(Object o) {
        if (o instanceof Track track) {
            return this.title.equals(track.title) && this.length == track.length;
        }

        return false;
    }
    public void play() {
        System.out.println("Playing Track: " + title);
        System.out.println("Track length: " + length);
    }
}