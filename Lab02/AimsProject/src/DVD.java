public class DVD {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DVD(String title) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
    }
    public DVD(String category, String title, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DVD(String director, String category, String title, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DVD(String title, String category, String director, int length, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {this.title = title;}
}
