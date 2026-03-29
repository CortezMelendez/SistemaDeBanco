package com.example.welcome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Bienvenido extends ClasePadreControladores {
    @FXML
    protected void abrirSaldo(ActionEvent event) {
        cambiarVentana(event,"Saldo.fxml");

    }

    @FXML
    protected void depositarSaldo(ActionEvent event) {
        cambiarVentana(event,"depositar-view.fxml");
    }

    @FXML
    protected void retirarSaldo(ActionEvent event) {
        cambiarVentana(event,"retirar-view.fxml");

    }

    @FXML
    protected void salir(ActionEvent event) {
        cambiarVentana(event, "hello-view.fxml");
    }


}


