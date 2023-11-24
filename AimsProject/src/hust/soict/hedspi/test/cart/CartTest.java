package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DVD;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DVD dvd1 = new DVD("The Lion King", "Animation", "Rogers Alter", 87, 19.95f);
        cart.addDVDsToCart(dvd1);

        DVD dvd2 = new DVD("Inception", "Sci-Fi", "Christopher Nolan", 148, 24.99f);
        cart.addDVDsToCart(dvd2);

        DVD dvd3 = new DVD("Casablanca", "Drama", "Michael Curtiz", 102, 14.99f);
        cart.addDVDsToCart(dvd3);

        cart.print();
        cart.searchDVD(3);
        cart.searchDVD("Casablanca");
    }
}
