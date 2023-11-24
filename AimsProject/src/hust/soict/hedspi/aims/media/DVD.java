package hust.soict.hedspi.aims.media;

public class DVD extends Disc {
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $%n", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }
    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }
}
