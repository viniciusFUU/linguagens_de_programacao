package forms.com.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TenisController {
    private ObservableList<String> dadosCadastrados = FXCollections.observableArrayList();

    @FXML
    private TextField marcaTenisField;
    @FXML
    private TextField corTenisField;
    @FXML
    private TextField canoTenisField;

    @FXML
    void handleSendTenis(){
        String marca = marcaTenisField.getText();
        String cor = corTenisField.getText();
        String cano = canoTenisField.getText();

        dadosCadastrados.add("TENIS - " + "Marca: " + marca + ", Cor: " + cor + "Tipo do Cano: " + cano);

        exibirDadosTenis(marca, cor, cano);
    }

    public void exibirDadosTenis(String marca, String cor, String tinta){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Marca: " + marca + ", Cor: " + cor + ", Tipo do Cano: " + tinta);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
    
}
