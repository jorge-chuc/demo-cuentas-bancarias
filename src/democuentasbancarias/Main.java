/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import model.CuentaBasica;
import model.CuentaDeAhorro;

/**
 *
 * @author JorgeLuis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Probando la clase CuentaBasica");
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
        
        System.out.println("Probando la clase CuentaDeAhorro");
        CuentaDeAhorro misAhorros = new CuentaDeAhorro(2, "Ana Arévalo");
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        misAhorros.depositar(1500.0);
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        misAhorros.retirar(200.0);
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        misAhorros.depositar(300.0);
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        misAhorros.retirar(1000.0);
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        misAhorros.retirar(1000.0);
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
        System.out.println("Interés ganado: " 
                + misAhorros.calcularInteres());
        System.out.println("Comisión por saldo: " 
                + misAhorros.calcularComisionPorSaldo());
        misAhorros.realizarCorteMensual();
        System.out.println("Saldo de la cuenta: " + misAhorros.getSaldo());
    }
    
}
