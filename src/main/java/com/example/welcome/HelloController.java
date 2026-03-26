package com.example.welcome;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.print.MultiDocPrintService;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label usuario;
    @FXML
    private Label contrasenia;
    @FXML
    private TextField intUsuario;
    @FXML
    private TextField intContrasenia;

    @FXML
    protected void abrirVentana(){
        if (("admin".equals(intUsuario.getText()))&&("admin123".equals(intContrasenia.getText()))) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SegundaVista2.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("SegundaVista2");
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
