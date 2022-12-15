package com.example.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public Canvas panel;
    public TextField ttext;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void onClick(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(Integer.parseInt(ttext.getText()));
        shape.setX(x);
        shape.setY(y);
        shape.draw(panel.getGraphicsContext2D());

    }

    public void onCleen(ActionEvent actionEvent) {

        GraphicsContext gr = panel.getGraphicsContext2D();
        gr.clearRect(0, 0, panel.getWidth(), panel.getHeight());
    }
}
