package com.example.welcome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController extends ClasePadreControladores {
    @FXML
    private TextField intUsuario;
    @FXML
    private TextField intContrasenia;
    @FXML
    private Label error;

    @FXML
    protected void abrirVentana(ActionEvent event){

        if (("admin".equals(intUsuario.getText())) &&
                ("admin123".equals(intContrasenia.getText()))) {

            cambiarVentana(event, "BienvenidoUsuario.fxml");

        } else {
            error.setVisible(true);
        }

        }
    @FXML
    protected void salir(ActionEvent event) {
        System.exit(0);
    }
    }


