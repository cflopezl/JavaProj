/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivotexto;

import java.io.*;

/**
 *
 * @author C-Lo 12
 */
public class ManejoArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String info = "";
        try{
            InputStream in = new FileInputStream("C:\\temp\\alumno.txt");
            OutputStream out = new FileOutputStream("C:\\cflopezl\\backupAlumno.txt",true);
            int b = in.read();
            while(b!=-1){
                //System.out.println((char)b);
                
                if((char)b=='#'){
                    //System.out.println(info);
                    info="";
                }else{
                    info+=""+(char)b;
                    out.write(b);
                }
                b=in.read();
            }
            //System.out.println(info);
            in.close();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
