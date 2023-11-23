package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DVD;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public List<DVD> DVDsList = new ArrayList<>();
    private int DVDsQuantity = 0;

    public int addDVDsToCart(DVD disc) {
        if (this.DVDsQuantity < MAX_NUMBERS_ORDERED) {
            this.DVDsList.add(disc);
            this.DVDsQuantity += 1;
            System.out.println("The disc has been added.");

            return 1;
        } else {
            System.out.println("The cart is almost full.");

            return 0;
        }
    }

    public void addDVDsToCart(List<DVD> discList) {
        this.DVDsList.addAll(discList);

        if (this.DVDsQuantity > MAX_NUMBERS_ORDERED) {
            this.DVDsList.subList(0, MAX_NUMBERS_ORDERED);
            this.DVDsQuantity = MAX_NUMBERS_ORDERED;
        }
    }



    public void addDVDsToCart(DVD disc1, DVD disc2) {
        if (this.DVDsQuantity <= MAX_NUMBERS_ORDERED) {
            this.DVDsList.add(disc1);
            this.DVDsQuantity += 1;
        }

        if (this.DVDsQuantity <= MAX_NUMBERS_ORDERED) {
            this.DVDsList.add(disc2);
            this.DVDsQuantity += 1;
        }
    }

    public int removeDVDsFromCart(DVD disc) {
        for (int i = 0; i < this.DVDsQuantity; i++) {
            DVD item = this.DVDsList.get(i);

            if (item.equals(disc)) {
                this.DVDsList.remove(i);

                return 1;
            }
        }
        return 0;
    }

    public float calculateCost() {
        float total_cost = 0;
        for (DVD disc : this.DVDsList) {
            total_cost += disc.getCost();
        }

        return total_cost;
    }

    public void print() {
        for (int i = 0; i < this.DVDsQuantity; i++) {
            System.out.printf("%d. %s", i + 1, this.DVDsList.get(i).toString());
        }
    }

    public DVD searchDVD(int id) {
        for (int i = 0; i < this.DVDsQuantity; i++) {
            if (id == this.DVDsList.get(i).getId()) {
                System.out.printf("%d. %s", i + 1, this.DVDsList.get(i).toString());
                return this.DVDsList.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "No matching found!");
        return null;
    }

    public DVD searchDVD(String title) {
        for (int i = 0; i < this.DVDsQuantity; i++) {
            String s = this.DVDsList.get(i).getTitle();
            if (this.DVDsList.get(i).isMatch(title)) {
                System.out.printf("%d. %s", i + 1, this.DVDsList.get(i).toString());

                return this.DVDsList.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "No matching found!");
        return null;
    }
}
