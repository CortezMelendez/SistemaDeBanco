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


public class depositarController extends ClasePadreControladores {
    @FXML
    private TextField getDeposito;
    @FXML
    private Label saldo;
    @FXML
    private Label logs;
    
    
    @FXML
    public void depositar() {
        double deposito = Double.parseDouble(getDeposito.getText());
        ClasePadreBanco.depositar(deposito);
        saldo.setText("Tu nuevo saldo es: $" + String.format("%.2f", ClasePadreBanco.getSaldo()));
    }

    @FXML
    public void volver(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BienvenidoUsuario.fxml"));
            Parent root = loader.load();

            Stage stageNuevo = new Stage();
            stageNuevo.setTitle("Menu");
            stageNuevo.setScene(new Scene(root));
            stageNuevo.show();

            // ✅ Cerrar ventana actual
            Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stageActual.close();

        } catch (IOException e) {
            logs.setText("Error al cargar la ventana");
        }
    }
}
