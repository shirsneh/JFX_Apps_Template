package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class primaryController {

    @FXML
    private Button calcBtn;

    @FXML
    private Button clockBtn;

    @FXML
    private Button ImageSliderBtn;

    @FXML
    void clickOnCalc(ActionEvent event) {
        //add code here
        Platform.runLater(() -> {
            App.setWindowTitle("My calculator");
            try {
                App.setContent("/calc");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    void clickOnImageSlider(ActionEvent event) {
        //add code here
        Platform.runLater(() -> {
            App.setWindowTitle("My Image Slider");
            try {
                App.setContent("/ImageSlider");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    void clickOnClock(ActionEvent event) {
        //add code here
        Platform.runLater(() -> {
            App.setWindowTitle("My digital clock");
            try {
                App.setContent("/clock");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    void initialize() {


    }

}
