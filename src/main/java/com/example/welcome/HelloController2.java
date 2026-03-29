package com.example.welcome;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController2 extends ClasePadreBanco {

    @FXML
    private Label resultado;

    @FXML
    protected void saldo(){
          resultado.setText("SALDO: $" + ClasePadreBanco.getSaldo());

    }
}
