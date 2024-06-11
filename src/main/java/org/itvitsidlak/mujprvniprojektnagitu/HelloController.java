package org.itvitsidlak.mujprvniprojektnagitu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.ColorPicker;

public class HelloController {
    @FXML
    private Polygon auto2;
    @FXML
    private Polygon auto3;
@FXML
    private Rectangle auto1;
    @FXML
    private Rectangle okno1;
    @FXML
    private Rectangle okno2;
    @FXML
    private Circle kolo1;
    @FXML
    private Circle kolo2;
    @FXML
    private ColorPicker color;

    public boolean wracked = false;

    public void changeColor(ActionEvent actionEvent) {
        auto1.setFill(color.getValue());
        auto2.setFill(color.getValue());
        auto3.setFill(color.getValue());
    }
}