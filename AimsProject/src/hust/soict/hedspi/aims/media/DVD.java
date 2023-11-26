package hust.soict.hedspi.aims.media;

import javax.swing.*;

public class DVD extends Disc {
    public DVD() { super(); }
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $%n", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }
    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }
    public void play() {
        if (this.getLength() > 0) {
            System.out.println("Playing: " + this.toString());
        } else {
            JOptionPane.showMessageDialog(null, "DVD cannot be displayed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
