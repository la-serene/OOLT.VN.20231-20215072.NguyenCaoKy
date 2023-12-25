//package hust.soict.hedspi.aims.screen.customer.controller;
//
//import hust.soict.hedspi.aims.cart.Cart;
//import hust.soict.hedspi.aims.media.Media;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.*;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//public class CartController {
//    public ToggleGroup filterCategory;
//    public Label costLabel;
//    private Cart cart;
//    public TableView tblMedia;
//    public TableColumn colMedia;
//    public TableColumn colMediaId;
//    public TableColumn colMediaTitle;
//    public TableColumn colMediaCategory;
//    public TableColumn colMediaCost;
//    public Button btnRemove;
//    public Button btnPlaceOrder;
//    public Button btnPlay;
//
//    public CartController(Cart cart) {
//        this.cart = cart;
//    }
//
//    @FXML
//    public void initialize() {
//        colMediaId.setCellValueFactory(
//                new PropertyValueFactory<Media, Integer>("id")
//        );
//        colMediaTitle.setCellValueFactory(
//                new PropertyValueFactory<Media, String>("title")
//        );
//        colMediaCategory.setCellValueFactory(
//                new PropertyValueFactory<Media, String>("category")
//        );
//        colMediaCost.setCellValueFactory(
//                new PropertyValueFactory<Media, Float>("cost")
//        );
//
//        if (cart.getItemOrdered() != null) {
//            tblMedia.setItems(cart.getItemOrdered());
//        }
//    }
//
//    public void btnViewStorePressed(ActionEvent actionEvent) {
//    }
//
//    public void btnPlayPressed(ActionEvent actionEvent) {
//    }
//
//    public void btnRemovePressed(ActionEvent actionEvent) {
//    }
//}
