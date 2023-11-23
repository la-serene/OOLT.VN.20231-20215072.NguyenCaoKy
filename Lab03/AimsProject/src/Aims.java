public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DVD disc1 = new DVD("Happier", "Musical", "Timm Bertner", 87, 19.25f);
        DVD disc2 = new DVD("One Piece", "Anime", "Steve Dawnson", 102, 20.45f);

        anOrder.addDVDsToCart(disc1);
        anOrder.addDVDsToCart(disc2);

        System.out.println("Total cost is: ");
        System.out.println(anOrder.calculateCost());

        anOrder.removeDVDsFromCart(disc1);

        System.out.println("Total cost is: ");
        System.out.println(anOrder.calculateCost());
    }
}