package com;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connection.DbConnection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
// import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class JogadorController{
    @FXML
    private List<Jogador> listaJogadores = new ArrayList<>(); 
    
    @FXML
    private ListView<String> viewJogadores = new ListView<>();

    @FXML
    private TextField nomeField;

    @FXML
    private TextField posicaoField;
    
    @FXML
    private TextField clubeField;
    
    @FXML
    private TextField nomeEdit;

    @FXML
    private TextField posicaoEdit;
    
    @FXML
    private TextField clubeEdit;

    private static String itens;

    @FXML
    private void initialize(){
        readJogadores();
    }

    public void createJogador(){
        DbConnection db = new DbConnection();

        String nome = nomeField.getText();
        String posicao = posicaoField.getText();
        String clube = clubeField.getText();

        Jogador jogador = new Jogador(nome, posicao, clube);
        listaJogadores.add(jogador);

        try{
            if (nome.isEmpty() || posicao.isEmpty() || clube.isEmpty()){
                Alert alert = new Alert(AlertType.WARNING);
                alert.show();
            } else {
                db.executeWithOutReturn("INSERT INTO jogador (nome_jogador, posicao, clube)"+
                 "VALUES ('"+ nome +"', '"+ posicao +"', '"+ clube +"')");
    
                 Alert alert = new Alert(AlertType.CONFIRMATION);
                 alert.show();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            db.Desconnect();
        }
    }

    public void readJogadores(){
        DbConnection db = new DbConnection();        
        ResultSet resultListaJogadores = db.executeWithReturn("SELECT * FROM jogador");
        
        try{
            while (resultListaJogadores.next()) {
                String nomeJogador = resultListaJogadores.getString("nome_jogador");
                String posicaoJogador = resultListaJogadores.getString("posicao");
                String clubeJogador = resultListaJogadores.getString("clube");
                
                String detalhes = "Nome: " + nomeJogador + " | Posição: " + posicaoJogador + " | Clube: " + clubeJogador;
                Jogador jogador = new Jogador(nomeJogador, posicaoJogador, clubeJogador);

                viewJogadores.getItems().add(detalhes);
                listaJogadores.add(jogador);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            db.Desconnect();
        }
    }

    @FXML
    public void updateJogador(){
        if (itens == null){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("Selecione um jogador para editar!");
            alert.show();
            return;
        }

        String nomeOriginal = itens.split(" | ")[1];
        String nomeItem = nomeEdit.getText();
        String posicaoItem = posicaoEdit.getText();
        String clubeItem = clubeEdit.getText();

        DbConnection db = new DbConnection();

        try{
            if(nomeItem != null && posicaoItem != null && clubeItem != null){
                db.executeWithOutReturn("UPDATE jogador SET nome_jogador = '"+ nomeItem +"'," +
                "posicao = '"+ posicaoItem +"'," + 
                "clube = '"+ clubeItem +"'" + 
                "WHERE nome_jogador = '"+ nomeOriginal +"'");
    
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.show();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            db.Desconnect();
        }

        viewJogadores.refresh();
    }

    @FXML
    public void deleteJogador(){
        DbConnection db = new DbConnection();

        itens = viewJogadores.getSelectionModel().getSelectedItem();
        System.out.println(itens);

        String nomeOriginal = itens.split(" | ")[1];
        System.out.println(nomeOriginal);

        try {
            db.executeWithOutReturn("DELETE FROM jogador WHERE nome_jogador = '"+ nomeOriginal +"'");
            
            viewJogadores.getItems().remove(itens);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            db.Desconnect();
        }
    }

    @FXML
    private void openLista(ActionEvent event){
        openFXML("screenListJogador.fxml");
    }

    @FXML
    private void openEditJogador(ActionEvent event){
        openFXML("screenEditJogador.fxml");

        itens = viewJogadores.getSelectionModel().getSelectedItem();
    }

    private void openFXML(String fxmlFileName){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/" + fxmlFileName));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
