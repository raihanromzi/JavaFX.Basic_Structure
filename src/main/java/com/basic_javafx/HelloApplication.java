package com.basic_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
//  Stage is Top-Level JavaFX Container, it's a main windows
    @Override
    public void start(Stage stage) throws IOException {
//      Load UI (Scene Graph) from FXML
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VBox.fxml"));

//      Initialize scene size
        Scene scene = new Scene(fxmlLoader.load(), 700, 275);

//      Set Stage, Resizeable
        stage.setTitle("JavaFX Basic");
        stage.setResizable(true);

//      Each stage require a scene, each scene needs scene graph (Rectangle, UI)
//      Java FX is like a theater, the stage is always the same, but the scene (UI, color) can be different
//      We don't have to make a new stage, but we can import from a different fxml
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}