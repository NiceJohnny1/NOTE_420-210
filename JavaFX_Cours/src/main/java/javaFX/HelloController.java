package javaFX;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButonClick() {
        welcomeText.setText("Welcome to JavaFX Application");
    }
}
