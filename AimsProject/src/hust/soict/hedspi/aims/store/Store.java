package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media already exists!");
        } else {
            itemsInStore.add(media);
            System.out.println("Media added!");
        }
    }
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed!");
        } else {
            System.out.println("Media not found!");
        }
    }
    public Media searchMedia(String title) {
        for (Media m : itemsInStore)
            if (m.getTitle().equals(title)) return m;

        return null;
    }
}
