package hust.soict.hedspi.test.screen.customer.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {
    private static Store store;
    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));

        ViewStoreController viewStoreController = new ViewStoreController(store);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        store = new Store();

        Book myBook = new Book();
        DVD myDVD = new DVD();
        CompactDisc myCD = new CompactDisc();

        // Setting titles using the setTitle method
        myBook.setTitle("The Great Gatsby");
        myDVD.setTitle("Inception");
        myCD.setTitle("Abbey Road");

        myDVD.setLength(100);
        myCD.setLength(60);

        myDVD.setCost(20);
        myCD.setCost(20);

        store.addMedia(myBook);
        store.addMedia(myCD);
        store.addMedia(myDVD);

        launch(args);
    }
}
