package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import javafx.stage.Stage;


public class HelloController {
    public Label Timeleft;
    public ImageView thePicture;
    public MenuButton menuButton1;
    public ToggleButton toggleButton1;
    public ChoiceBox choiceBox1;
    public ComboBox comboBox1;
    public RadioButton radioButton1;

    private Stage primaryStage;

    private Image pic1;
    private Image pic2;
    private Image pic3;
    private Image pic4;
    private Image pic5;
    private Image pic6;

    public void initialize() throws Exception {
        FileInputStream imageStream = new FileInputStream("NoPressure_Cover_Final.jpg");
        pic1 = new Image(imageStream);

        imageStream = new FileInputStream("Cowboy_BeBop.jpg");
        pic2 = new Image(imageStream);

         imageStream = new FileInputStream("Red-Hood.jpg");
        pic3 = new Image(imageStream);

         imageStream = new FileInputStream("Boba-Fett-Fanart.jpg");
        pic4 = new Image(imageStream);

         imageStream = new FileInputStream("Burning.jpg");
        pic5 = new Image(imageStream);

        thePicture.setImage(pic1);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void displayBobaFett() throws Exception {
        thePicture.setImage(pic4);
    }

    public void displayNoPressureCover() throws Exception {
        thePicture.setImage(pic1);
    }
    public void displayCowboybebop() throws Exception {
        thePicture.setImage(pic2);
    }
    public void displayRedHood() throws Exception {
        thePicture.setImage(pic3);
    }
    public void burning() throws Exception {
        thePicture.setImage(pic5);
    }

    public void addImage() throws Exception {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        FileInputStream imageStream = new FileInputStream(selectedFile);
        pic6 = new Image(imageStream);
        thePicture.setImage(pic6);

        MenuItem newPicMenuButton = new MenuItem(selectedFile.getName());
        newPicMenuButton.setOnAction(arg -> {
            thePicture.setImage(pic6);
        });
        menuButton1.getItems().add(newPicMenuButton);

    }

}