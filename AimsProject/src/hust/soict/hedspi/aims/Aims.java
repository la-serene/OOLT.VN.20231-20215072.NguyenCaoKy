package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        showMenu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        System.out.println();

        switch (option) {
            case 1 -> {
                for (int i = 0; i < store.itemsInStore.size(); i++)
                    System.out.printf("%d. %s%n", i + 1, store.itemsInStore.get(i).toString());
                storeMenu();
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        scanner.nextLine();
                        String title = scanner.nextLine();
                        Media media = store.searchMedia(title);

                        if (media == null) {
                            JOptionPane.showMessageDialog(null, "No media found!");
                            break;
                        }
                        else System.out.println(media.toString());

                        if (media instanceof Book) bookDetailsMenu();
                        else discDetailsMenu();

                        option = scanner.nextInt();
                        switch (option) {
                            case 1 -> {
                                cart.addMedia(media);
                                break;
                            }

                            case 2 -> {
                                media.play();
                            }
                        }

                    }

                    case 2 -> {

                    }

                    default -> {
                    }
                }
            }

            case 2 -> {

            }

            default -> {
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void bookDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1");
    }

    public static void discDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}