package hust.soict.hedspi.aims.screen.customer.controller;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartController {
    private Cart cart;
    public TableView tblMedia;
    public TableColumn colMediaId;
    public TableColumn colMediaTitle;
    public TableColumn colMediaCategory;
    public TableColumn colMediaCost;
    public Button btnRemove;
    public Button btnPlay;
    public ToggleGroup filterCategory;
    public Label costLabel;
    public CartController(Cart cart) {
        this.cart = cart;
    }
    @FXML
    public void initialize() {
        colMediaId.setCellValueFactory(
                new PropertyValueFactory<Media, Integer>("Id")
        );
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("Title")
        );
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("Category")
        );
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("Cost")
        );

        if (cart.getItemsOrdered() != null)
            tblMedia.setItems(cart.getItemsOrdered());
    }
    public void btnRemovePressed(ActionEvent actionEvent) {
    }
    public void btnPlayPressed(ActionEvent actionEvent) {
    }
    public void btnViewStorePressed(ActionEvent actionEvent) {
    }
}
