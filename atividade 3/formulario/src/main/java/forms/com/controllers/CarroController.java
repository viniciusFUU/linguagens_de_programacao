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

public class CarroController {
    private ObservableList<String> dadosCadastrados = FXCollections.observableArrayList();
    
    @FXML
    private TextField fabricanteField;
    @FXML
    private TextField corCarroField;
    @FXML
    private TextField modeloCarroField;

    @FXML
    void handleSendCarro(){
        String fabricante = fabricanteField.getText();
        String cor = corCarroField.getText();
        String modelo = modeloCarroField.getText();

        dadosCadastrados.add("CARRO - " + "Modelo: " + fabricante + ", Modelo: " + modelo + ", Cor: " + cor);

        exibirDadosCarro(fabricante, modelo, cor);
    }

    public void exibirDadosCarro(String fabricante, String modelo, String cor){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Fabricante: " + fabricante + ", Modelo: " + modelo + ", Cor: " + cor);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }

    
}
