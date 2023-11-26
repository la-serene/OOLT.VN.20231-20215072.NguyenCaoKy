package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Media;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public ArrayList<Media> itemsOrdered = new ArrayList<>();
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Media already exists!");
        } else {
            itemsOrdered.add(media);
            System.out.println("Media added!");
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Media removed!");
        } else {
            System.out.println("Media not found!");
        }
    }
    public float calculateCost() {
        float total_cost = 0;
        for (Media media : itemsOrdered) {
            total_cost += media.getCost();
        }

        return total_cost;
    }

    public void print() {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.printf("%d. %s", i + 1, itemsOrdered.get(i).toString());
        }
    }

    public Media searchDVD(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (id == itemsOrdered.get(i).getId()) {
                System.out.printf("%d. %s", i + 1, itemsOrdered.get(i).toString());
                
                return itemsOrdered.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "No matching found!");
        return null;
    }

    public Media searchDVD(String title) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            String s = itemsOrdered.get(i).getTitle();
            if (itemsOrdered.get(i).isMatch(title)) {
                System.out.printf("%d. %s", i + 1, itemsOrdered.get(i).toString());

                return itemsOrdered.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "No matching found!");
        return null;
    }
}
