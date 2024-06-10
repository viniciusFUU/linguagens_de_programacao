package com;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        stage.setTitle("Cadastrar Jogador");
        Platform.runLater(() -> {
            try {
                showPlayerScreen();
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private static Parent loadFXML(String fxml) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public void showPlayerScreen() throws Exception {
        Scene scene = new Scene(loadFXML("playerScreen"));
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
