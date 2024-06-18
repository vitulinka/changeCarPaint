package org.itvitsidlak.mujprvniprojektnagitu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.ColorPicker;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
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
    @FXML
    private Slider posouvac;

    public boolean wracked = false;

    public void changeColor(ActionEvent actionEvent) {
        auto1.setFill(color.getValue());
        auto2.setFill(color.getValue());
        auto3.setFill(color.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        posouvac.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                kolo1.setRadius((double)t1);
                kolo2.setRadius((double)t1);
            }
        });
    }
}