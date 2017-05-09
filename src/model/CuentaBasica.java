package model;

/**
 *
 * @author JorgeLuis
 */
public class CuentaBasica {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    public CuentaBasica(int numDeCuenta, String cliente) {
        this.numeroDeCuenta = numDeCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public boolean depositar(double cantidad) {
        boolean seRealizoDeposito;
        if (cantidad > 0.0) {
            saldo = saldo + cantidad;
            seRealizoDeposito = true;
        }
        else {
            seRealizoDeposito = false;
        }
        return seRealizoDeposito;
    }
    
    public boolean retirar(double cantidad) {
        boolean seRealizoRetiro;
        if (cantidad <= getSaldo()) {
            saldo = saldo - cantidad;
            seRealizoRetiro = true;
        }
        else {
            seRealizoRetiro = false;
        }
        return seRealizoRetiro;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public String getCliente() {
        return cliente;
    }
    
}
