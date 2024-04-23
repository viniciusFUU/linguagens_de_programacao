package forms.com.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * MainController
 */
public class MainController {
    @FXML
    private void openCarroScreen(ActionEvent event){
        openFXML("carro.fxml");
    }

    @FXML
    private void openCanetaScreen(ActionEvent event){
        openFXML("caneta.fxml");
    }

    @FXML
    private void openTenisScreen(ActionEvent event){
        openFXML("tenis.fxml");
    }

    private void openFXML(String fxmlFileName){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/forms/com/" + fxmlFileName));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}