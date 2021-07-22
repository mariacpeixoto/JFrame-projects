/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularmediaj;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcularMediaJ extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, titulo;
    JTextField texto1, texto2, texto3, texto4, texto5;
    JButton calcular;
    
    public CalcularMediaJ(){
        super("Calcular Média");
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.BLACK);
        
        titulo = new JLabel("Cálculo de Média");
        rotulo1 = new JLabel("1° Nota:");
        rotulo2 = new JLabel("2° Nota:");
        rotulo3 = new JLabel("3° Nota:");
        rotulo4 = new JLabel("4° Nota:");
        rotulo5 = new JLabel("Média:");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        texto5 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        
        titulo.setBounds(180, 20, 150, 25);
        rotulo1.setBounds(150, 60, 100, 25);
        rotulo2.setBounds(150, 100, 100, 25);
        rotulo3.setBounds(150, 140, 100, 25);
        rotulo4.setBounds(150, 180, 100, 25);
        rotulo5.setBounds(155, 290, 120, 25);
        
        titulo.setForeground(Color.CYAN);
        rotulo1.setForeground(Color.WHITE);
        rotulo2.setForeground(Color.WHITE);
        rotulo3.setForeground(Color.WHITE);
        rotulo4.setForeground(Color.WHITE);
        rotulo5.setForeground(Color.WHITE);
        
        titulo.setFont(new Font("Times New Roman",Font.BOLD,18));
        
        calcular.setBounds(190, 240, 120, 25);
        calcular.setBackground(Color.CYAN);
        
        texto1.setBounds(200, 60, 100, 25);
        texto2.setBounds(200, 100, 100, 25);
        texto3.setBounds(200, 140, 100, 25);
        texto4.setBounds(200, 180, 100, 25);
        texto5.setBounds(200, 290, 100, 25);
        
        calcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1, num2, num3, num4, resul;
                resul = 0;
                num1 = Double.parseDouble(texto1.getText());
                num2 = Double.parseDouble(texto2.getText());
                num3 = Double.parseDouble(texto3.getText());
                num4 = Double.parseDouble(texto4.getText());
                resul = (num1 + num2 + num3 + num4)/4;
                texto5.setVisible(true);
                texto5.setText(""+resul);
            }
        });
        
        tela.add(titulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(calcular);
        
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }   
    
    public static void main(String[] args) {
        CalcularMediaJ app = new CalcularMediaJ();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
