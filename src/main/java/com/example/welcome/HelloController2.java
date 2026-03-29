package com.example.welcome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController2 extends  ClasePadreControladores {

    @FXML
    private Label resultado;

    @FXML
    protected void saldo() {
        resultado.setText("El Saldo: $" + ClasePadreBanco.getSaldo());
    }

    @FXML
    protected void salir(ActionEvent event) {
        cambiarVentana(event, "BienvenidoUsuario.fxml");
    }

}
