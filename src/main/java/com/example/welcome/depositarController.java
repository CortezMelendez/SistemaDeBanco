package com.example.welcome;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;


public class depositarController {
    @FXML
    private TextField getDeposito;
    @FXML
    private Label saldo;
    @FXML
    private Label logs;

    public void depositar(){
        saldo.setText("Tu saldo nuevo saldo es: "+getDeposito.getText()+"");
    }

    public void volver(ActionEvent Event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BienvenidoUsuario.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Menu");
            stage.setScene(new Scene(root));
            stage.show();

            Stage currentStage = (Stage) logs.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            logs.setText("Error al cargar la ventana");
        }
    }
}
