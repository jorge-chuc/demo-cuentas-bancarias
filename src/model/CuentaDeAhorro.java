/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JorgeLuis
 */
public class CuentaDeAhorro extends CuentaBasica {
    private final double TASA_DE_INTERES_PREDET = 4.0;
    private final double COMISION_POR_SALDO_PREDET = 50.0;
    private double tasaDeInteres;
    private double comisionPorSaldo;
    
    public CuentaDeAhorro(int numeroDeCuenta, String cliente) {
        super(numeroDeCuenta, cliente);
        this.tasaDeInteres = TASA_DE_INTERES_PREDET;
        comisionPorSaldo = COMISION_POR_SALDO_PREDET;
    }
    
    public double calcularInteres() {
        double tasaDeInteresDiaria = this.tasaDeInteres / 360;
        double interes = tasaDeInteresDiaria / 100.0 * 30 * this.getSaldo();
        return interes;
    }
    
    public double calcularComisionPorSaldo() {
        double comision = 0.0;
        if (this.getSaldo() < 1000.0) {
            comision = this.comisionPorSaldo;
        }
        return comision;
    }
    
    public void realizarCorteMensual() {
        double interes = this.calcularInteres();
        this.depositar(interes);
        double comision = this.calcularComisionPorSaldo();
        this.retirar(comision);
    }
}
