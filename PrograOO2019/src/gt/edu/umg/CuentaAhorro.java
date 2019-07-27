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
    private Cliente arrCliente[]; 

  
    
    CuentaAhorro(){
        noCuenta="-";
        nombreCuenta="*";
        saldo=0;
        arrCliente = new Cliente[5];
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
        String respuesta = "CuentaAhorro{" + "noCuenta=" + this.noCuenta + ", nombreCuenta=" + nombreCuenta + ", saldo=" + saldo + "}\n";
        for (int i = 0; i < arrCliente.length; i++) {
            if(arrCliente[i]!=null)
                respuesta += arrCliente[i].toString()+"\n";
        }
        return respuesta;
    }
    
    public void copiar(CuentaAhorro ca){
        this.noCuenta=ca.noCuenta;
        this.nombreCuenta=ca.nombreCuenta;
        this.saldo=ca.saldo;
    }
    
    public Cliente[] getArrCliente() {
        return arrCliente;
    }

    public void setArrCliente(Cliente[] arrCliente) {
        this.arrCliente = arrCliente;
    }
}
