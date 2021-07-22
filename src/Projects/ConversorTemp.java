/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemp;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorTemp extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, titulo1;
    JTextField texto1, texto2, texto3;
    JButton conversor;
    
    public ConversorTemp(){
        super("Conversor de Temperatura");
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.LIGHT_GRAY);
        
        titulo1 = new JLabel("Conversor de Temperatura");
        
        rotulo1 = new JLabel("Graus Celsius (°C):");
        rotulo2 = new JLabel("Graus Fahrenheit (°F):");
        rotulo3 = new JLabel("Graus Kelvin (°K):");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        conversor = new JButton("Converter");
        
        titulo1.setBounds(115, 20, 210, 25);
        rotulo1.setBounds(100, 70, 150, 25);
        rotulo2.setBounds(85, 170, 150, 25);
        rotulo3.setBounds(110, 210, 150, 25);
        conversor.setBounds(120, 120, 200, 25);
        
        titulo1.setForeground(Color.DARK_GRAY);
        
        titulo1.setFont(new Font("Arial",Font.BOLD,16));
        
        conversor.setBackground(Color.DARK_GRAY);
        conversor.setForeground(Color.WHITE);
        
        texto1.setBounds(220, 70, 100, 25);
        texto2.setBounds(220, 170, 100, 25);
        texto3.setBounds(220, 210, 100, 25);
        
        conversor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double c, f, k;
                c = Double.parseDouble(texto1.getText());
                f = (c * 9/5) + 32;
                k = c + 273.15;
                texto2.setVisible(true);
                texto2.setText(""+f);
                texto3.setVisible(true);
                texto3.setText(""+k);
            }
        });
        
        tela.add(titulo1);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(conversor);
        
        setSize(450,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        ConversorTemp app = new ConversorTemp();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
