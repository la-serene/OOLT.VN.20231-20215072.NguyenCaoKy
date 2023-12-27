package hust.soict.hedspi.aims.screen.customer.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class PlayingPopUpController {
    @FXML
    public AnchorPane playingPopUp;
    @FXML
    public TextArea tfPlayingPopUp;
    public void setPlayingText(String title, float cost) {
        tfPlayingPopUp.setText("Title: " + title + "\n" + "Cost: " + cost);
    }
}
