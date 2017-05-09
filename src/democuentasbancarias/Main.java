/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import model.CuentaBasica;

/**
 *
 * @author JorgeLuis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBasica miCuenta = new CuentaBasica(1, "Juan Perez");
        System.out.println("Saldo de la cuenta: " + miCuenta.getSaldo());
        miCuenta.depositar(1000.0);
        System.out.println("Saldo de la cuenta: " + miCuenta.getSaldo());
        miCuenta.depositar(1500.0);
        System.out.println("Saldo de la cuenta: " + miCuenta.getSaldo());
        miCuenta.retirar(200.0);
        System.out.println("Saldo de la cuenta: " + miCuenta.getSaldo());
        miCuenta.depositar(300.0);
        System.out.println("Saldo de la cuenta: " + miCuenta.getSaldo());
        miCuenta.retirar(1000.0);
        System.out.println("Saldo de la cuenta: " + miCuenta.getSaldo());
    }
    
}
