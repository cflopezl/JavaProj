/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upana.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author C-Lo 12
 */
public class TestDB {
    
    public void ConsultaDB(){
        try {
            //1. cargar la clase del driver
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            //2. crear la conexión
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            //3. crear objeto statement
            Statement st = conn.createStatement();
            //4. mostrar todos los registros de la tabla Customer
            String query = "SELECT * FROM customer";
            ResultSet rs = st.executeQuery(query);
            int i=1;
            while(rs.next()){
                System.out.println((i++)+". ID="+rs.getInt(1)+", NOMBRE="+rs.getString("NAME")+", CIUDAD="+rs.getString("CITY"));
            }
            //5. Cerrar la conexión
            conn.close();
        } catch (Exception e) {
            System.out.println("error db "+e.getMessage());
        }
        

    }
    
    public void agregarInfo(){
        try {
            //1. cargar la clase del driver
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            //2. crear la conexión
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            //3. crear objeto statement
            Statement st = conn.createStatement();
            //4. mostrar todos los registros de la tabla Customer
            String query = "INSERT INTO customer(customer_id, "+
                    "discount_code, zip ,name) VALUES(43,'N','95117','Marvin')";
            st.executeUpdate(query);
            conn.commit();
            //5. Cerrar la conexión
            conn.close();
        } catch (Exception e) {
            System.out.println("error db "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        TestDB db = new TestDB();
        db.agregarInfo();
        db.ConsultaDB();
    }
    
}
