/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.venta.logic;

import edu.umg.ventas.dao.Customer;
import edu.umg.ventas.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author C-Lo 12
 */
public class AccessHelp {
    
    Session session = null;

    public AccessHelp() {
        if(this.session == null)
            this.session= HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Customer> getClientes(){
        List<Customer> listCustomer = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Customer order by name");
            listCustomer = (List<Customer>)q.list();
            tx.commit();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listCustomer;
    }
    
    public void addCliente(Customer c){
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
        
    }
    
}
