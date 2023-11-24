package hust.soict.hedspi.aims.media;

public record Track(String title, int length) implements Playable {
    public boolean equals(Object o) {
        if (o instanceof Track track) {
            return this.title().equals(track.title()) && this.length() == track.length();
        }

        return false;
    }
    public void play() {
        System.out.println("Playing Track: " + this.title());
        System.out.println("Track length: " + this.length());
    }
}