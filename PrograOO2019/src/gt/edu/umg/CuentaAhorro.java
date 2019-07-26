/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg;

/**
 *
 * @author C-Lo 12
 */
public class CuentaAhorro {
    private String noCuenta;
    private String nombreCuenta;
    private double saldo;
    
    CuentaAhorro(){
        noCuenta="-";
        nombreCuenta="*";
        saldo=0;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "noCuenta=" + this.noCuenta + ", nombreCuenta=" + nombreCuenta + ", saldo=" + saldo + '}';
    }
    
    public void copiar(CuentaAhorro ca){
        this.noCuenta=ca.noCuenta;
        this.nombreCuenta=ca.nombreCuenta;
        this.saldo=ca.saldo;
    }
}
