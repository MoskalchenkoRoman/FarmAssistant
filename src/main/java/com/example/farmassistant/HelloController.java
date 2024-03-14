package com.example.farmassistant;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView fon4;

    private final int fonStop = 990;

    @FXML
    private TextField numberOfEggs;

    @FXML
    private TextField otherExpenses;

    @FXML
    private TextField price;

    @FXML
    private Button welcomeText;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Стоимость 1 яйца = " + (((Integer.parseInt(price.getText()))+(Integer.parseInt(otherExpenses.getText())))/(Integer.parseInt(numberOfEggs.getText()) * 30)) + " рублей\n"
                + "Расходы за месяц = " + ((Integer.parseInt(price.getText())) + (Integer.parseInt(otherExpenses.getText()))) + " рублей\n" +
                 "Снесено яиц за месяц = " + ((Integer.parseInt(numberOfEggs.getText())) * 30) + " штук!", ButtonType.OK);
        alert.showAndWait();

    }

    @FXML
    void initialize() {
        TranslateTransition fonAni = new TranslateTransition(Duration.millis(10000), fon4);
        fonAni.setFromX(0);
        fonAni.setToX(fonStop);
        fonAni.setInterpolator(Interpolator.LINEAR);
        fonAni.setCycleCount(Animation.INDEFINITE);
        fonAni.play();


    }

}

