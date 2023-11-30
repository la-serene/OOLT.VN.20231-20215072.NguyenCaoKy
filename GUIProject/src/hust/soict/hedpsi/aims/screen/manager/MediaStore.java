package hust.soict.hedpsi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JFrame {
    Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout = (new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());

    }
}
