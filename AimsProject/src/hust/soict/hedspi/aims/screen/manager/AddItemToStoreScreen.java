package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AddItemToStoreScreen extends JFrame {
    public Store store;
    private JTextField titleField = new JTextField();
    private JTextField categoryField = new JTextField();
    private JTextField costField = new JTextField();

    public AddItemToStoreScreen(Store store) {
        this.store = store;
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class addBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String title = titleField.getText();
            String category = categoryField.getText();
            int cost = Integer.parseInt(costField.getText());

            store.addMedia(new Book(title, category, cost));
        }
    }
}
