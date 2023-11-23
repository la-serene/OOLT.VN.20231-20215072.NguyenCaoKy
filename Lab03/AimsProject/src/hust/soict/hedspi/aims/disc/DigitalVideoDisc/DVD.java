package hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import hust.soict.hedspi.aims.cart.Cart.Cart;

import javax.swing.*;
import java.util.List;

public class DVD {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DVD(String title) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
    }
    public DVD(String category, String title, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DVD(String director, String category, String title, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DVD(String title, String category, String director, int length, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public int getId() { return id; }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {this.title = title;}

    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %f $%n", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    public DVD searchDVDsByID(Cart cart, int id) {
        for (int i = 0; i < cart.DVDsList.size(); i++) {
            if (id == cart.DVDsList.get(i).getId()) {
                System.out.printf("%d. %s", i + 1, cart.DVDsList.get(i).toString());
                return cart.DVDsList.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "No matching found!");
        return null;
    }

    public DVD searchDVDsByTitle(Cart cart, String title) {
        for (int i = 0; i < cart.DVDsList.size(); i++) {
            if (cart.DVDsList.get(i).isMatch(title)) {
                System.out.printf("%d. %s", i + 1, cart.DVDsList.get(i).toString());
                return cart.DVDsList.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "No matching found!");
        return null;
    }
}
