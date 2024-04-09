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

public class FormularioJavaFXController {
    private ObservableList<String> dadosCadastrados = FXCollections.observableArrayList();

    @FXML
    private TextField nomeField;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField documentoField;

    @FXML void handleEnviar(){
        String nome = nomeField.getText();
        String idade = idadeField.getText();
        String documento = documentoField.getText();

        dadosCadastrados.add("Nome: " + nome + ", Idade: " + idade + ", Documento: " + documento);

        exibirDados(nome, idade, documento);
    }

    public void exibirDados(String nome, String idade, String documento){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Nome: " + nome + ", Idade: " + idade + ", Documento: " + documento);
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
