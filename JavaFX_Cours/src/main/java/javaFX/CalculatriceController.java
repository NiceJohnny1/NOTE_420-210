package javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class CalculatriceController {
    @FXML
    private Label affichage;

    @FXML
    public void onClickAddValue(ActionEvent event){
        String val = ((Button) event.getSource()).getText();
        if(affichage.getText().compareTo("0") == 0){
            affichage.setText("");
        }
        affichage.setText(affichage.getText() + val);

    }

}