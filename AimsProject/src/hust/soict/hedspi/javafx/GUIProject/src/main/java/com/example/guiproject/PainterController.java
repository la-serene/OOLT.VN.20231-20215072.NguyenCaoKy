package com.example.guiproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class    PainterController {
    @FXML
    private Pane drawingAreaPane;

    @FXML
    public void clearButtonPressed(ActionEvent e) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    public void drawingAreaMouseDragged(MouseEvent e) {
        Circle newCircle = new Circle(e.getX(), e.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    public void drawingAreaEraser(MouseEvent e) {
        Circle newCircle = new Circle(e.getX(), e.getY(), 4, Color.WHITE);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
