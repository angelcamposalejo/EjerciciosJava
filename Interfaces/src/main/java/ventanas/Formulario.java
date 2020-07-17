/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author angelcampos
 */
public class Formulario extends JFrame implements ActionListener{
    private JTextField textFieldUno;
    private JLabel labelUno;
    private JButton botonUno;
    
    public Formulario(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        labelUno = new JLabel("Mensaje:");
        labelUno.setBounds(15, 10, 100, 30);
        add(labelUno);
        
        textFieldUno = new JTextField();
        textFieldUno.setBounds(80,16,190,20);
        add(textFieldUno);
        
        botonUno = new JButton("Mostrar");
        botonUno.setBounds(10,60,100,30);
        add(botonUno);
        botonUno.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == botonUno){
            String cadena = textFieldUno.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    
    public static void main(String[] args){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }
}
