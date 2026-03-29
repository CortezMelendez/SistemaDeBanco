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

    private int intentos=3;
    @FXML
    private Label usuario;
    @FXML
    private Label contrasenia;

    @FXML
    protected void abrirVentana(ActionEvent event){

            if (("admin".equals(intUsuario.getText())) &&
                    ("admin123".equals(intContrasenia.getText()))) {

                cambiarVentana(event, "BienvenidoUsuario.fxml");

            } else {
                intentos--;
                error.setVisible(true);
                error.setText("Usuario o contraseña incorrectos. Intentos restantes: " + intentos);

                if (intentos == 0) {
                    error.setText("Cuenta bloqueada");
                    intUsuario.setVisible(false);
                    intContrasenia.setVisible(false);
                    usuario.setVisible(false);
                    contrasenia.setVisible(false);

                }
            }


    }
    @FXML
    protected void salir(ActionEvent event) {
        System.exit(0);
    }

    }


