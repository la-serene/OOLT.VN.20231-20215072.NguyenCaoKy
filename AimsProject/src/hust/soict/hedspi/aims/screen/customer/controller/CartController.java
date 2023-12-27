package hust.soict.hedspi.aims.screen.customer.controller;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartController {
    private Cart cart;
    @FXML
    public TableView<Media> tblMedia;
    @FXML
    public TableColumn<Media, Integer> colMediaId;
    @FXML
    public TableColumn<Media, String> colMediaTitle;
    @FXML
    public TableColumn<Media, String> colMediaCategory;
    @FXML
    public TableColumn<Float, String> colMediaCost;
    @FXML
    public Button btnRemove;
    @FXML
    public Button btnPlay;
    @FXML TextField tfFilter;
    @FXML
    public ToggleGroup filterCategory;
    @FXML
    public Label costLabel;
    public CartController(Cart cart) {
        this.cart = cart;
    }
    @FXML
    public void initialize() {
        colMediaId.setCellValueFactory(
                new PropertyValueFactory<>("Id")
        );
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<>("Title")
        );
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<>("Category")
        );
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<>("Cost")
        );

        if (cart.getItemsOrdered() != null)
            tblMedia.setItems(cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> updateButtonBar(newValue)
        );

        tfFilter.textProperty().addListener(
                (observable, oldValue, newValue) -> showFilteredMedia(newValue)
        );
    }
    void showFilteredMedia(String value) {

    }
    void updateButtonBar(Media media) {
        if (media == null) {
            btnPlay.setVisible(false);
            btnRemove.setVisible(false);
        }

        if (media != null) {
            btnRemove.setVisible(true);

            btnPlay.setVisible(media instanceof Playable);
        }
    }
    @FXML
    void btnRemovePressed(ActionEvent e) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }
}
