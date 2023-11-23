package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DVD;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<DVD> itemsInStore = new ArrayList<>();

    public void addDVD(DVD dvd) {
        this.itemsInStore.add(dvd);
    }
}
