package hust.soict.hedspi.aims.cart.Cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DVD;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DVD> DVDsList = new ArrayList<>();
    private int DVDsQuantity = 0;

    public int addDVDsToCart(DVD disc) {
        if (DVDsList.size() < MAX_NUMBERS_ORDERED) {
            DVDsList.add(disc);
            System.out.println("The disc has been added.");

            return 1;
        } else {
            System.out.println("The cart is almost full.");

            return 0;
        }
    }

    public void addDVDsToCart(List<DVD> discList) {
        DVDsList.addAll(discList);

        if (DVDsList.size() > MAX_NUMBERS_ORDERED) {
            DVDsList.subList(0, MAX_NUMBERS_ORDERED);
        }
    }

    public void addDVDsToCart(DVD disc1, DVD disc2) {
        if (DVDsList.size() <= MAX_NUMBERS_ORDERED) {
            DVDsList.add(disc1);
        }

        if (DVDsList.size() <= MAX_NUMBERS_ORDERED) {
            DVDsList.add(disc2);
        }
    }

    public int removeDVDsFromCart(DVD disc) {
        for (int i = 0; i < DVDsList.size(); i++) {
            DVD item = DVDsList.get(i);

            if (item.equals(disc)) {
                DVDsList.remove(i);

                return 1;
            }
        }
        return 0;
    }

    public float calculateCost() {
        float total_cost = 0;
        for (DVD disc : DVDsList) {
            total_cost += disc.getCost();
        }

        return total_cost;
    }
}
