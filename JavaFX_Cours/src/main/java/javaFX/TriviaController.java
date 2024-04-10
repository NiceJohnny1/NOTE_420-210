package javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;

public class TriviaController implements Initializable {

    @FXML
    private Label question;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        question.setText("Quelle est la capitale du Canada");
        button1.setText("Montréal");
        button2.setText("Ottawa");
        button2.getStyleClass().add("Good");
        button3.setText("Toronto");
        button4.setText("Vancouver");
    }

    @FXML
    public void onClickButtonChoice(ActionEvent event){
        Button btn = (Button) event.getSource();
        if (button1.getStyleClass().contains("good")){
            button1.getStyleClass().add("Green");
        }
        if (button2.getStyleClass().contains("good")){
            button2.getStyleClass().add("Green");
        }
        if (button3.getStyleClass().contains("good")){
            button3.getStyleClass().add("Green");
        }
        if (button4.getStyleClass().contains("good")){
            button4.getStyleClass().add("Green");
        }

        if (!btn.getStyleClass().contains("Good")){
            btn.getStyleClass().add("Red");
        }
        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
    }
}
