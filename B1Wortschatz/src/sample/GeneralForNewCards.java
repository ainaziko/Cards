package sample;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.animations.Scale;
import sample.animations.Shake;
import sample.animations.ShakeUpDown;
public class GeneralForNewCards {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea wordInput;

    @FXML
    private TextArea exampleInput;

    @FXML
    private TextArea translationInput;

    @FXML
    private Button addNewCard;

    @FXML
    private Button backButton;

    @FXML
    private Label wordLabel;

    @FXML
    private Label exampleLabel;

    @FXML
    private Label translationLabel;

    public String fileName;
    public String text;
    public String exampleInputS;


    public String getWordInput() {
        if(text.isEmpty() || text.isBlank()){
            return "Write some text here.";
        }else{
            return text;
        }
    }


    public String getExampleInput() {
        return exampleInputS;
    }


    public TextArea getTranslationInput() {
        return translationInput;
    }


    public  GeneralForNewCards(){}
    public GeneralForNewCards(String fileName){
        this.fileName = fileName;
    }

    public GeneralForNewCards(String fileName, String text){
        this.fileName = fileName;
        this.text = text;
    }


    public void addToFile(String fileName) throws IOException {
        this.fileName = fileName;
        FileWriter writer = new  FileWriter(fileName, true);
        if (wordInput.getText().isEmpty() || wordInput.getText().isBlank() || exampleInput.getText().isEmpty() || exampleInput.getText().isBlank() || translationInput.getText().isEmpty() || translationInput.getText().isBlank()){
            int x = 0;
            System.out.println(x);
            Shake shake = new Shake(wordInput);
            shake.PlayAnim();
            Shake shake1 = new Shake(exampleInput);
            shake1.PlayAnim();
            Shake shake2 = new Shake(translationInput);
            shake2.PlayAnim();
            Shake shakeL1 = new Shake(wordLabel);
            Shake shakeL2 = new Shake(exampleLabel);
            Shake shakeL3 = new Shake(translationLabel);
            shakeL1.PlayAnim();
            shakeL2.PlayAnim();
            shakeL3.PlayAnim();
        } else{
            writer.write("<" + wordInput.getText().trim() + ">" + "{" + exampleInput.getText().trim() + "}" + "[" + translationInput.getText().trim() + "]\n");
            writer.close();
            ShakeUpDown upDown = new ShakeUpDown(wordInput);
            ShakeUpDown upDown1 = new ShakeUpDown(exampleInput);
            ShakeUpDown upDown2 = new ShakeUpDown(translationInput);
            Shake upDownL1 = new ShakeUpDown(wordLabel);
            Shake upDownL2 = new ShakeUpDown(exampleLabel);
            Shake upDownL3 = new ShakeUpDown(translationLabel);
            upDown.PlayAnim();
            upDown1.PlayAnim();
            upDown2.PlayAnim();
            upDownL1.PlayAnim();
            upDownL2.PlayAnim();
            upDownL3.PlayAnim();
            wordInput.setText("");
            exampleInput.setText("");
            translationInput.setText("");
        }
    }

    public String getFileName(){
        return fileName;
    }

}
