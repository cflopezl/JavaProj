/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.umg.venta.logic.AccessHelp;
import edu.umg.ventas.dao.Customer;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author C-Lo 12
 */
@ManagedBean
@SessionScoped
public class VistaClienteMB {
    List<Customer> listCustomer;
    Customer cus;
    AccessHelp helper;
    static int customerId=212;

    /**
     * Creates a new instance of VistaClienteMB
     */
    public VistaClienteMB() {
        helper = new AccessHelp();
        listCustomer = helper.getClientes();
        cus=new Customer();
    }

    public List<Customer> getListCustomer() {
        return listCustomer;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }
    
    

    public void setListCustomer(List<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }      
    
    public void borrar(Customer customer){
        helper.delCliente(customer);
        listCustomer = helper.getClientes();
    }
    
    public void agregar(){
        Customer c = this.cus;
        c.setCustomerId(customerId++);
        c.setZip("95117");
        c.setDiscountCode('N');
        helper.addCliente(c);
        listCustomer = helper.getClientes();
    }
    
}
