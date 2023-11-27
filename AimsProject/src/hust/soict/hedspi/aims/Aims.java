package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        List<Media> media = new ArrayList<>();

        DVD dvd = new DVD();
        Book book = new Book();
        CompactDisc cd = new CompactDisc();

        media.add(dvd);
        media.add(book);
        media.add(cd);

        for (Media m : media) {
            System.out.println(m.toString());
        }
    }
}