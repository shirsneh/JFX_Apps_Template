package org.example.ImageSlider;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ImageSlider{
    private int j = 0;
    private int numOfImages = 15;
    private Image[] images;
    @FXML
    Button lbutton;
    @FXML
    Button rButton;
    @FXML
    ImageView imageView;


    @FXML
    void initialize() {
       //add code here to load images.

    }

    @FXML
    void goLeft(ActionEvent event) {
        if(j>0){
            j--;
        }else{
            j=numOfImages-1;
        }
        imageView.setImage(images[j]);
    }

    @FXML
    void goRight(ActionEvent event) {
        if(j<numOfImages-1){
            j++;
        }else{
            j=0;
        }
        imageView.setImage(images[j]);
    }

}
