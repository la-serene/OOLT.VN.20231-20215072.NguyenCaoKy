package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AddItemToStoreScreen extends JFrame {
    private StoreManagerScreen storeManagerScreen;
    private JTextField titleField = new JTextField();
    private JTextField categoryField = new JTextField();
    private JTextField costField = new JTextField();

    public AddItemToStoreScreen(StoreManagerScreen storeManagerScreen) {
        this.storeManagerScreen = storeManagerScreen;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel itemInputField = new JPanel(new GridLayout(3, 2));
        itemInputField.add(new JLabel("Title"));
        itemInputField.add(titleField);
        itemInputField.add(new JLabel("Category"));
        itemInputField.add(categoryField);
        itemInputField.add(new JLabel("Cost"));
        itemInputField.add(costField);

        JButton addBtn = new JButton("Add");
        addBtn.addActionListener(new addBtnListener());

        cp.add(itemInputField, BorderLayout.CENTER);
        cp.add(addBtn, BorderLayout.SOUTH);

        setTitle("Add Item to Store Screen");
        setSize(440, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    private class addBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String title = titleField.getText();
            String category = categoryField.getText();
            int cost = Integer.parseInt(costField.getText());

            storeManagerScreen.getStore().addMedia(new Book(title, category, cost));
            storeManagerScreen.repaint();
            storeManagerScreen.revalidate();
        }
    }
}
