/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.umg.venta.logic.AccessHelp;
import edu.umg.ventas.dao.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author C-Lo 12
 */
@ManagedBean
@SessionScoped
public class ClienteMB {
    List<Customer> clientes;
    Customer cli;
    AccessHelp helper;

    /**
     * Creates a new instance of ClienteMB
     */
    public ClienteMB() {
        clientes=new ArrayList<Customer>();
        helper = new AccessHelp();
        clientes = helper.getClientes();
        cli = new Customer();
    }

    public List<Customer> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Customer> clientes) {
        this.clientes = clientes;
    }
    
    public void borrarCliente(Customer cliente){
        helper.delCliente(cliente);
        clientes = helper.getClientes();
    }
    
    public void agregarCliente(){
        cli.setZip("95117");
        cli.setDiscountCode('N');
        cli.setCity("GT");
        helper.addCliente(cli);
        clientes = helper.getClientes();
    }

    public Customer getCli() {
        return cli;
    }

    public void setCli(Customer cli) {
        this.cli = cli;
    }
    
    
    
}
