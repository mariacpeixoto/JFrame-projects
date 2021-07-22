/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoremapitagoras;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeoremaPitagoras extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, titulo1, titulo2;
    JTextField texto1, texto2, texto3;
    JButton calcular;
    
    public TeoremaPitagoras(){
        super("Teorema de Pitágoras");
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.GRAY);
        
        titulo1 = new JLabel("Teorema de Pitágoras");
        titulo2 = new JLabel("c² = a² + b²");
        
        rotulo1 = new JLabel("Valor do 1° cateto(a):");
        rotulo2 = new JLabel("Valor do 2° cateto(b):");
        rotulo3 = new JLabel("Hipotenusa(c):");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        
        titulo1.setBounds(160, 20, 180, 25);
        titulo2.setBounds(200, 40, 120, 25);
        
        rotulo1.setBounds(125, 80, 150, 25);
        rotulo2.setBounds(125, 120, 150, 25);
        rotulo3.setBounds(164, 220, 150, 25);
        
        titulo1.setForeground(Color.LIGHT_GRAY);
        titulo2.setForeground(Color.LIGHT_GRAY);
        
        titulo1.setFont(new Font("Times New Roman",Font.BOLD,18));
        titulo2.setFont(new Font("Times New Roman",Font.BOLD,18));
        
        calcular.setBounds(150, 170, 180, 25);
        calcular.setBackground(Color.LIGHT_GRAY);
        
        texto1.setBounds(250, 80, 100, 25);
        texto2.setBounds(250, 120, 100, 25);
        texto3.setBounds(250, 220, 100, 25);
        
        calcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a, b, c;
                a = Double.parseDouble(texto1.getText());
                b = Double.parseDouble(texto2.getText());
                c = Math.sqrt((a * a) + (b * b));
                texto3.setVisible(true);
                texto3.setText(""+c);
            }
        });
        
        tela.add(titulo1);
        tela.add(titulo2);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(calcular);
        
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        TeoremaPitagoras app = new TeoremaPitagoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
