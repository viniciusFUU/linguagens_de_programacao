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
    private ObservableList<String> dadosCadastrados = FXCollections.observableArrayList();

    @FXML
    private TextField marcaField;
    @FXML
    private TextField corCanetaField;
    @FXML
    private TextField tintaField;
    @FXML
    private TextField fabricanteField;
    @FXML
    private TextField corCarroField;
    @FXML
    private TextField modeloCarroField;
    @FXML
    private TextField marcaTenisField;
    @FXML
    private TextField corTenisField;
    @FXML
    private TextField canoTenisField;


    @FXML 
    void handleSendTinta(){
        String marca = marcaField.getText();
        String cor = corCanetaField.getText();
        String tinta = tintaField.getText();

        dadosCadastrados.add("CANETA - " + "Marca: " + marca + ", Cor: " + cor + ", Tinta: " + tinta);

        exibirDadosCaneta(marca, cor, tinta);
    }

    @FXML
    void handleSendCarro(){
        String fabricante = fabricanteField.getText();
        String cor = corCarroField.getText();
        String modelo = modeloCarroField.getText();

        dadosCadastrados.add("CARRO - " + "Modelo: " + fabricante + ", Modelo: " + modelo + ", Cor: " + cor);

        exibirDadosCarro(fabricante, modelo, cor);
    }

    @FXML
    void handleSendTenis(){
        String marca = marcaTenisField.getText();
        String cor = corTenisField.getText();
        String cano = canoTenisField.getText();

        dadosCadastrados.add("TENIS - " + "Marca: " + marca + ", Cor: " + cor + "Tipo do Cano: " + cano);

        exibirDadosTenis(marca, cor, cano);
    }

    public void exibirDadosCaneta(String marca, String cor, String tinta){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Marca: " + marca + ", Cor: " + cor + ", Tinta: " + tinta);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    public void exibirDadosCarro(String fabricante, String modelo, String cor){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Fabricante: " + fabricante + ", Modelo: " + modelo + ", Cor: " + cor);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    public void exibirDadosTenis(String marca, String cor, String tinta){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Marca: " + marca + ", Cor: " + cor + ", Tipo do Cano: " + tinta);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleMostrarTodos(){
        Stage stage = new Stage();
        stage.setTitle("Dados Cadastrados");

        ListView<String> listView = new ListView<>();
        listView.setItems(dadosCadastrados);

        Scene scene = new Scene(listView, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
