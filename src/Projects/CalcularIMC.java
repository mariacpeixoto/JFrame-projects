/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcularIMC extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, titulo1, exibir;
    JTextField texto1, texto2, texto3;
    JButton calcular;
    
    public CalcularIMC(){
        super("Cálculo de IMC");
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.BLACK);
        
        titulo1 = new JLabel("Cálculo de IMC");
        
        rotulo1 = new JLabel("Peso:");
        rotulo2 = new JLabel("Altura (m):");
        rotulo3 = new JLabel("IMC:");
        exibir = new JLabel("");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        calcular = new JButton("Calcular IMC");
        
        titulo1.setBounds(180, 20, 180, 25);
        rotulo1.setBounds(160, 70, 100, 25);
        rotulo2.setBounds(135, 110, 100, 25);
        rotulo3.setBounds(170, 210, 100, 25);
        exibir.setBounds(180, 250, 200, 25);
        
        titulo1.setForeground(Color.LIGHT_GRAY);
        rotulo1.setForeground(Color.WHITE);
        rotulo2.setForeground(Color.WHITE);
        rotulo3.setForeground(Color.WHITE);
        exibir.setForeground(Color.WHITE);
        
        titulo1.setFont(new Font("Arial",Font.BOLD,18));
        exibir.setFont(new Font("Times New Roman",Font.BOLD,14));
        
        calcular.setBounds(170, 160, 150, 25);
        calcular.setBackground(Color.LIGHT_GRAY);
        
        texto1.setBounds(200, 70, 100, 25);
        texto2.setBounds(200, 110, 100, 25);
        texto3.setBounds(200, 210, 100, 25);
        
        calcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                float p, a, imc;
                p = Float.parseFloat(texto1.getText());
                a = Float.parseFloat(texto2.getText());
                imc = p / (a * a);
                texto3.setVisible(true);
                texto3.setText(""+imc);
                if(imc < 18){
                    exibir.setVisible(true);
                    exibir.setText("Abaixo do Peso Ideal");
                }
                else if(imc >= 18.5 && imc <= 24.99){
                    exibir.setVisible(true);
                    exibir.setText("Peso Ideal");
            }
                else if(imc > 25){
                    exibir.setVisible(true);
                    exibir.setText("Acima do Peso Ideal");
                }
            }
        });
        
        tela.add(titulo1);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(calcular);
        tela.add(exibir);
        
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        CalcularIMC app = new CalcularIMC();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
