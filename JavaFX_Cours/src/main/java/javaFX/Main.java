package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création du contenu du stage
        Label label = new Label("Hello, JavaFX!");

        // Création de la scène et ajout du contenu
        Scene scene = new Scene(label, 300, 200);

        // Configuration du stage
        primaryStage.setTitle("Ma première application JavaFX");
        primaryStage.setScene(scene);

        // Affichage du stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}