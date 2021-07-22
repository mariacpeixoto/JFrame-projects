/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraj;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJ extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
    
    public CalculadoraJ(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1° Número:");
        rotulo2 = new JLabel("2° Número:");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        
        rotulo1.setBounds(150, 20, 120, 25);
        rotulo2.setBounds(150, 60, 120, 25);
        
        texto1.setBounds(220, 20, 100, 25);
        texto2.setBounds(220, 60, 100, 25);
        
        exibir.setBounds(20, 140, 200, 25);
        somar.setBounds(20, 100, 100, 25);
        subtrair.setBounds(125, 100, 100, 25);
        multiplicar.setBounds(230, 100, 100, 25);
        dividir.setBounds(335, 100, 100, 25);
        
        somar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1, num2, soma;
                soma = 0;
                num1 = Integer.parseInt(texto1.getText());
                num2 = Integer.parseInt(texto2.getText());
                soma = num1 + num2;
                exibir.setVisible(true);
                exibir.setText("O resultado da soma é: "+soma);
            }
        });
        subtrair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1, num2, subtracao;
                subtracao = 0;
                num1 = Integer.parseInt(texto1.getText());
                num2 = Integer.parseInt(texto2.getText());
                subtracao = num1 - num2;
                exibir.setVisible(true);
                exibir.setText("O resultado da subtração é: "+subtracao);
            }
        });
        multiplicar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1, num2, multi;
                multi = 0;
                num1 = Integer.parseInt(texto1.getText());
                num2 = Integer.parseInt(texto2.getText());
                multi = num1 * num2;
                exibir.setVisible(true);
                exibir.setText("O resultado da multiplicação é: "+multi);
            }
        });
        dividir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1, num2, div;
                div = 0;
                num1 = Integer.parseInt(texto1.getText());
                num2 = Integer.parseInt(texto2.getText());
                div = num1 / num2;
                exibir.setVisible(true);
                exibir.setText("O resultado da divisão é: "+div);
            }
        });
        exibir.setVisible(false);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        
        setSize(500,250);
        setVisible(true);
        setLocationRelativeTo(null);
}
   
    public static void main(String[] args) {
        CalculadoraJ app = new CalculadoraJ();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
