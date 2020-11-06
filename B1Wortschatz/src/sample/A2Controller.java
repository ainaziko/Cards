package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class A2Controller extends General{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label word;

    @FXML
    private Label examples;

    @FXML
    private Label translation;

    @FXML
    private Button showTranslationButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button add;



    String currentWord;

    @FXML
    void initialize() {
        nextButton.setOnAction(e-> update("a2Words.txt"));
        showTranslationButton.setOnAction(e-> showAnswer());
    }

    public void goToCreateCard(ActionEvent actionEvent) throws IOException {
        Stage stagee = (Stage) translation.getScene().getWindow();
        // do what you have to do
        stagee.close();
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("a2AddNewCardSample.fxml"));
        stage.setScene(new Scene(layout));
        stage.show();
    }

    @Override
    void goBack(ActionEvent event) throws IOException {
        super.goBack(event);
    }

    @Override
    public void showAnswer(){
        translation.setVisible(true);
    }


}