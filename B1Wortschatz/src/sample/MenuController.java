package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.scenario.effect.DropShadow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button a1;

    @FXML
    private Button a2;

    @FXML
    private Button b1;

    @FXML
    void initialize() {
    }
    public void goToA1(ActionEvent actionEvent) throws IOException {
        Stage stagee = (Stage) a1.getScene().getWindow();
        stagee.close();
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("a1Sample.fxml"));
        stage.setScene(new Scene(layout));
        stage.show();
    }
    public void goToA2(ActionEvent actionEvent) throws IOException {
        Stage stagee = (Stage) b1.getScene().getWindow();
        // do what you have to do
        stagee.close();
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("a2Sample.fxml"));
        stage.setScene(new Scene(layout));
        stage.show();
    }

    public void goToB1(ActionEvent actionEvent) throws IOException {
        Stage stagee = (Stage) b1.getScene().getWindow();
        // do what you have to do
        stagee.close();
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setScene(new Scene(layout));
        stage.show();
    }
}
