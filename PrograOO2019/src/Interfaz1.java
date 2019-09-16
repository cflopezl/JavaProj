
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-Lo 12
 */
public class Interfaz1 extends JFrame
{
    private JButton btnSur, btnNorte, btnEste, btnOeste, btnCentral;
    
    private JButton    botonIn1, botonIn2;
    
    private JPanel panelInferior, panelIzq, panelDer;
    
    private JLabel etiquetaSu;
    
    private JButton botonIz1, botonIz2, botonIz3;
    
    private JCheckBox checkBox1,checkBox2;

    public Interfaz1() throws HeadlessException {
        this.setVisible(true);
        this.setSize(410,210);
        this.setTitle("Progra 2");
        this.setLocationRelativeTo(null);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        etiquetaSu = new JLabel("DEMO UMG");
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 20));
        
        btnSur=new JButton("Sur");
        btnNorte = new JButton("Norte");
        btnEste = new JButton("Este");
        btnOeste = new JButton("Oeste");
        btnCentral = new JButton("Central");
        
        
        configurarPanelInferior();
        configurarPanelIzquierdo();
        configurarPanelDerecho();
        
        this.add(panelInferior, BorderLayout.SOUTH);
        this.add(etiquetaSu, BorderLayout.NORTH);
        this.add(panelDer, BorderLayout.EAST);
        this.add(panelIzq, BorderLayout.WEST);
        this.add(btnCentral, BorderLayout.CENTER);
        this.pack();
    }
    
    public void configurarPanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Aceptar");
        botonIn2=new JButton("Cancelar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
        
    }
    
    public void configurarPanelIzquierdo(){
        panelIzq=new JPanel();
        botonIz1=new JButton("Izq1");
        botonIz2=new JButton("Izq2");
        botonIz3=new JButton("Izq3");
        panelIzq.setLayout(new BoxLayout(panelIzq, BoxLayout.Y_AXIS));
        panelIzq.add(botonIz1);
        panelIzq.add(botonIz2);
        panelIzq.add(botonIz3);
        panelIzq.setBackground(Color.green);
    }
    
    public void configurarPanelDerecho()
    {
        
        panelDer=new JPanel();
        panelDer.setLayout(new BoxLayout(panelDer, BoxLayout.Y_AXIS));
        
        checkBox1=new JCheckBox("check box 1",true);
        checkBox2=new JCheckBox("check box 2");
        
        checkBox2.setSelected(true);
        
        panelDer.add(checkBox1);
        panelDer.add(checkBox2);
        
    }
    
    
    public static void main(String[] args) {
        Interfaz1 i1 = new Interfaz1();
    }
}
