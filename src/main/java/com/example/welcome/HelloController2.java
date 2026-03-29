package com.example.welcome;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController2 extends  ClasePadreBanco {

    @FXML
    private Label resultado;

    @FXML
    protected void saldo() {
        resultado.setText("El Saldo: $" + ClasePadreBanco.getSaldo());
    }

    @FXML
    protected void regresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BienvenidoUsuario.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Menu");
            stage.setScene(new Scene(root));
            stage.show();
            Stage stageActual = (Stage) resultado.getScene().getWindow();
            stageActual.close();
        } catch (Exception e) {
            resultado.setText("Error al regresar");
        }
    }
}
