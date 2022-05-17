/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacifradocésar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author antonio
 */
public class VentanaCifradoCésar extends JFrame{
    
    private JTextField cuadro;
    private JTextArea area;
    private JButton boton;
    private JLabel resultado;
   
   
    
    

    public VentanaCifradoCésar() throws HeadlessException {
        
        
        setTitle("Cifrado César");
        setSize(400, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+ "/src/tareacifradocésar/cesar.png");
        JLabel resultado = new JLabel("Tipo de desplazamiento: ");
        JTextField cuadro =new JTextField(5);
        JLabel resultado1 = new JLabel("Ingresa un mensaje:    ");
        JLabel resultado2 = new JLabel("   Mensaje cifrado: ");
        
        JTextArea area = new JTextArea(7, 15);
        area.setLineWrap(true);
        JTextArea area1 = new JTextArea(7, 15);
        area1.setLineWrap(true);
     
        JButton boton = new JButton(icono);
        boton.setBackground(Color.BLUE);
        boton.setOpaque(true);
        boton.setToolTipText("Cick para cifrar");
        
        
        
        this.getContentPane().add(resultado);
        this.getContentPane().add(cuadro);
        this.getContentPane().add(resultado1);
        this.getContentPane().add(resultado2);
        this.getContentPane().add(area);
        this.getContentPane().add(area1);
        this.getContentPane().add(boton);
        
        
        
        
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
               
                
            
            }
            
        });
        
    }
    
    
    
    
}
