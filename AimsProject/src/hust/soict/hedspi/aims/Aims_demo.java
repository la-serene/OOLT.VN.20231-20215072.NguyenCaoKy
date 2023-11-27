package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

import java.util.Scanner;

public class Aims_demo {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        Book myBook = new Book();
        DVD myDVD = new DVD();
        CompactDisc myCD = new CompactDisc();

        // Setting titles using the setTitle method
        myBook.setTitle("The Great Gatsby");
        myDVD.setTitle("Inception");
        myCD.setTitle("Abbey Road");

        store.addMedia(myBook);
        store.addMedia(myCD);
        store.addMedia(myDVD);

        Scanner scanner = new Scanner(System.in);
        int option;
        boolean loop = true;

        while (loop) {
            showMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    for (int i = 0; i < store.itemsInStore.size(); i++) {
                        System.out.printf("%d. %s%n", i + 1, store.itemsInStore.get(i).getTitle());
                    }
                    System.out.println();

                    storeMenu();
                    option = scanner.nextInt();
                    scanner.nextLine();

                    if (option == 1) {
                        System.out.println("Enter media title: ");
                        String title = scanner.nextLine();

                        if (title.length() != 0) {
                            Media media = store.searchMedia(title);
                            if (media != null) {
                                System.out.println(media);

                                if (media instanceof DVD || media instanceof CompactDisc) {
                                    discDetailsMenu();
                                } else bookDetailsMenu();

                                option = scanner.nextInt();
                                if (option == 1) {
                                    cart.addMedia(media);
                                    System.out.println("Media added to cart!");
                                    System.out.println();
                                } else if (option == 2) {
                                    if (media instanceof DVD || media instanceof CompactDisc) {
                                        media.play();
                                    } else {
                                        System.out.println();
                                    }
                                }

                            } else {
                                System.out.println("Media not found!");
                                System.out.println();
                            }
                        }
                    }
                    else if (option == 2) {
                        System.out.println("Enter media title: ");
                        String title = scanner.nextLine();

                        if (title.length() != 0) {
                            Media media = store.searchMedia(title);
                            if (media != null) {
                                cart.addMedia(media);

                                if (media instanceof DVD) {
                                    int count = 0;

                                    for (Media m : cart.itemsOrdered) {
                                        if (m instanceof DVD) {
                                            count++;
                                        }
                                    }

                                    System.out.printf("There are %d DVDs in cart%n", count);
                                    System.out.println();
                                }
                            }
                        }
                    }
                    else if (option == 3) {
                        System.out.println("Enter media title: ");
                        String title = scanner.nextLine();

                        if (title.length() != 0) {
                            Media media = store.searchMedia(title);
                            if ((media instanceof CompactDisc || media instanceof DVD)) {
                                media.play();
                            } else {
                                System.out.println("Media not playable!");
                            }
                        }
                    }
                }

                case 2 -> {
                    updateMenu();
                }

                case 3 -> {
                    cartMenu();
                }

                case 0 -> {
                    loop = false;
                }

                default -> {
                }
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

    public static void updateMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add media");
        System.out.println("2. Remove media");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void mediaTypeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Book");
        System.out.println("2. Compact Disc");
        System.out.println("3. Digital Video Disc");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
}