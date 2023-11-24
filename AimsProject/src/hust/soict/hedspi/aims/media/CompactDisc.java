package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    public CompactDisc() {
        super();
    }
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists!");
        } else {
            tracks.add(track);
            System.out.println("Track added!");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed!");
        } else {
            System.out.println("Track not found!");
        }
    }
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }
}
