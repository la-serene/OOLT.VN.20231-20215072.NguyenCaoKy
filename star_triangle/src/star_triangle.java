import javax.swing.*;

public class star_triangle {
    public static void main(String[] args) {
        String strN = JOptionPane.showInputDialog("Please enter n: ");
        int iN = Integer.parseInt(strN);
        int maxStar = 2 * (iN - 1) + 1;
        int midPos = iN - 1;

        for (int i = 0; i < iN; i++) {
            int low = midPos - i;
            int hi = midPos + i;

            for (int j = 0; j < maxStar; j++) {
                if ((j >= low) && (j <= hi)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
