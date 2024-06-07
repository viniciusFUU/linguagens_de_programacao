package com;

import java.util.LinkedList;
import java.util.List;

import com.connection.DbConnection;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
// import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class JogadorController {
    @FXML
    private List<Jogador> listaJogadores = new LinkedList<>(); 

    @FXML
    private TextField nomeField;

    @FXML
    private TextField posicaoField;
    
    @FXML
    private TextField clubeField;

    public void createJogador(){
        DbConnection db = new DbConnection();

        String nome = nomeField.getText();
        String posicao = posicaoField.getText();
        String clube = clubeField.getText();

        Jogador jogador = new Jogador(nome, posicao, clube);
        listaJogadores.add(jogador);

        try{
            db.executeWithOutReturn("INSERT INTO jogador (nome_jogador, posicao, clube)"+
             "VALUES ('"+ nome +"', '"+ posicao +"', '"+ clube +"')");

             Alert alert = new Alert(AlertType.CONFIRMATION);
             alert.show();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            db.Desconnect();
        }
    }
}
