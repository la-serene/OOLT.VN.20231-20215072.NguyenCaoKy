package hust.soict.hedspi.aims.screen.customer.controller;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemController {
    @FXML public Label lblTitle;
    @FXML public Label lblCost;
    @FXML public Button btnAddToCart;
    @FXML public Button btnPlay;
    private Media media;
    public void setData(Media media) {
        this.media = media;
        lblTitle.setText(media.getTitle());
        lblCost.setText(media.getCost() + "$");

        if (media instanceof Playable) btnPlay.setVisible(true);
        else {
            btnPlay.setVisible(false);
            HBox.setMargin(btnAddToCart, new Insets(0, 0, 0, 60));
        }
    }
    public void btnAddToCartClicked(ActionEvent e) {

    }
    public void btnPlayClicked(ActionEvent e) {
        try {
            final String PLAYING_POPUP_PATH = "/hust/soict/hedspi/aims/screen/customer/view/PlayingPopUp.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PLAYING_POPUP_PATH));
            Parent popUpRoot = fxmlLoader.load();

            PlayingPopUpController playingPopUpController = fxmlLoader.getController();
            playingPopUpController.setPlayingText(media.getTitle(), media.getCost());

            Stage popUpStage = new Stage();
            popUpStage.initModality(Modality.NONE);
            popUpStage.initOwner(((Node) e.getSource()).getScene().getWindow());
            popUpStage.setScene(new Scene(popUpRoot));
            popUpStage.setTitle("Playing~");
            popUpStage.show();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
