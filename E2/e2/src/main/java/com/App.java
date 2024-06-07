package com;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    private static Stage primaryStage;

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        primaryStage = stage;
        stage.setTitle("Cadastrar Jogador");
        showPlayerScreen();
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));

        return fxmlLoader.load(); 
    }

    public void showPlayerScreen() throws IOException{
        Scene scene = new Scene(loadFXML("playerScreen"));
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}
