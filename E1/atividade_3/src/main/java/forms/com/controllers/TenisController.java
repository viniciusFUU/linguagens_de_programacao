package forms.com.controllers;

import forms.com.connection.DbConnection;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TenisController {
    @FXML
    private TextField marcaTenisField;
    @FXML
    private TextField corTenisField;
    @FXML
    private TextField canoTenisField;

    @FXML
    private ListView<String> listViewTenis;

    @FXML
    void handleSendTenis(){
        DbConnection db = new DbConnection();

        String marca = marcaTenisField.getText();
        String cor = corTenisField.getText();
        String cano = canoTenisField.getText();

        try {
            db.executeWithOutReturn("INSERT INTO tenis (marca, cor, cano) VALUES ('"+ marca +"', '"+ cor +"', '"+ cano +"')");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            db.Desconnect();
        }

        exibirDadosTenis(marca, cor, cano);

        marcaTenisField.clear();
        corTenisField.clear();
        canoTenisField.clear();
    }

    public void exibirDadosTenis(String marca, String cor, String tinta){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Conteúdo cadastrado: \n" + "Marca: " + marca + ", Cor: " + cor + ", Tipo do Cano: " + tinta);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
    
}
