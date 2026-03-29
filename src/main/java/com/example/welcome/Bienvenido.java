package com.example.welcome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Bienvenido extends ClasePadreControladores {
    @FXML
    protected void abrirSaldo(ActionEvent event) {

    }

    @FXML
    protected void depositarSaldo(ActionEvent event) {
        cambiarVentana(event,"depositar-view.fxml");
    }

    @FXML
    protected void retirarSaldo(ActionEvent event) {
        cambiarVentana(event,"Saldo.fxml");

    }

    @FXML
    protected Bienvenido salir(ActionEvent event) {
        cambiarVentana(event, "hello-view.fxml");
    }


}


