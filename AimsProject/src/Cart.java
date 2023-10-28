import java.util.List;
import java.util.ArrayList;
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

    public int removeDVDsFromCart(DVD disc) {
        if (DVDsList.remove(disc)) {
            return 1;
        } else {
            return 0;
        }
    }

    public float calculateCost() {
        float total_cost = 0;
        for (DVD disc: DVDsList) {
            total_cost += disc.getCost();
        }

        return total_cost;
    }
}
