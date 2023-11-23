package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DVD;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<DVD> itemsInStore = new ArrayList<>();

    public void addDVDtoStore(DVD dvd) {
        System.out.println("New DVD added!");
        this.itemsInStore.add(dvd);
    }

    public void removeDVDtoStore(DVD dvd) {
        System.out.println("DVD successfully removed!");
        this.itemsInStore.remove(dvd);
    }
}
