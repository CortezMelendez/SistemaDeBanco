package com.example.welcome;

public class ClasePadreBanco {
 private static double saldo =0;

 public static double getSaldo(){
     return saldo;
 }
    public static boolean depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            return true;
        }
        return false;
    }

    public static boolean retirar(double retiro) {
        if (retiro>0 && retiro <=saldo) {
            saldo = saldo-retiro;
            return true;
        }
        else {
            return false;
        }
    }
}
