//package hust.soict.hedspi.aims.screen.customer.controller;
//
//import hust.soict.hedspi.aims.cart.Cart;
//import hust.soict.hedspi.aims.media.Media;
//import hust.soict.hedspi.aims.media.Playable;
//import javafx.beans.value.ObservableValue;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.*;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//import javax.swing.event.ChangeListener;
//
//public class CartController {
//    @FXML private Cart cart;
//    @FXML public TableView tblMedia;
//    @FXML public TableColumn colMediaId;
//    @FXML public TableColumn colMediaTitle;
//    @FXML public TableColumn colMediaCategory;
//    @FXML public TableColumn colMediaCost;
//    @FXML public Button btnRemove;
//    @FXML public Button btnPlay;
//    @FXML public ToggleGroup filterCategory;
//    @FXML public Label costLabel;
//    public CartController(Cart cart) {
//        this.cart = cart;
//    }
//    @FXML
//    public void initialize() {
//        colMediaId.setCellValueFactory(
//                new PropertyValueFactory<Media, Integer>("Id")
//        );
//        colMediaTitle.setCellValueFactory(
//                new PropertyValueFactory<Media, String>("Title")
//        );
//        colMediaCategory.setCellValueFactory(
//                new PropertyValueFactory<Media, String>("Category")
//        );
//        colMediaCost.setCellValueFactory(
//                new PropertyValueFactory<Media, Float>("Cost")
//        );
//
//        if (cart.getItemsOrdered() != null)
//            tblMedia.setItems(cart.getItemsOrdered());
//
//        btnPlay.setVisible(false);
//        btnRemove.setVisible(false);
//
//        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
//            @Override
//            public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
//                updateButtonBar(newValue);
//            }
//
//            void updateButtonBar(Media media) {
//                if (media == null) {
//                    btnPlay.setVisible(false);
//                    btnRemove.setVisible(false);
//                } else {
//                    btnRemove.setVisible(true);
//
//                    if (media instanceof Playable)
//                        btnPlay.setVisible(true);
//                }
//            }
//        });
//    }
//    public void btnRemovePressed(ActionEvent actionEvent) {
//    }
//    public void btnPlayPressed(ActionEvent actionEvent) {
//    }
//    public void btnViewStorePressed(ActionEvent actionEvent) {
//    }
//}
