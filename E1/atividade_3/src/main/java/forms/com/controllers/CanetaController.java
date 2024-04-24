package forms.com.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CanetaController {
    private ObservableList<String> canetasCadastradas = FXCollections.observableArrayList();

    @FXML
    private TextField marcaField;
    @FXML
    private TextField corCanetaField;
    @FXML
    private TextField tintaField;

    @FXML
    private ListView<String> listViewCaneta;


    @FXML 
    void handleSendCaneta(){
        String marca = marcaField.getText();
        String cor = corCanetaField.getText();
        String tinta = tintaField.getText();

        canetasCadastradas.add("CANETA - " + "Marca: " + marca + ", Cor: " + cor + ", Tinta: " + tinta);

        listViewCaneta.setItems(canetasCadastradas);
        exibirDadosCaneta(marca, cor, tinta);

        marcaField.clear();
        corCanetaField.clear();
        tintaField.clear();
    }

    public void exibirDadosCaneta(String marca, String cor, String tinta){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Conteúdo cadastrado: \n" + "Marca: " + marca + ", Cor: " + cor + ", Tinta: " + tinta);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}
