package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * JavaFX Main Apps manager
 */
public class App extends Application {

    private static Scene scene;
    public static Stage appStage;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root= loadFXML("/main");
        Scene start = new Scene(root);
        stage.setTitle("Welcome");
        scene = start;
        stage.setScene(start);
        appStage = stage;
        stage.show();
    }


    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    static void setWindowTitle(String title) {
        appStage.setTitle(title);
    }

    static void setContent(String pageName) throws IOException {
        Parent root= loadFXML(pageName);
        scene = new Scene(root);
        appStage.setScene(scene);
        appStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
