package com.example.welcome;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;

public class retirarController extends ClasePadreControladores{

    @FXML
    private TextField getRetiro;
    @FXML
    private Label saldo;
    @FXML
    private Label logs;

    @FXML
    public void retirar() {
        double retiro = Double.parseDouble(getRetiro.getText());
        ClasePadreBanco.retirar(retiro);
        saldo.setText("Tu nuevo saldo es: $" + String.format("%.2f", ClasePadreBanco.getSaldo()));
        logs.setText("Tu ultimo retiro fue de: $" + String.format("%.2f", retiro));
    }

    public void volver(ActionEvent event) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("BienvenidoUsuario.fxml"));
                Parent root = loader.load();

                Stage stageNuevo = new Stage();
                stageNuevo.setTitle("Menu");
                stageNuevo.setScene(new Scene(root));
                stageNuevo.show();

                Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                stageActual.close();

            } catch (IOException e) {
                logs.setText("Error al cargar la ventana");
            }
    }
}
