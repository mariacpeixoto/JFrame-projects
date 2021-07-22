/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipotriangulo;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipoTriangulo extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, titulo1, exibir;
    JTextField texto1, texto2, texto3;
    JButton verificar;
    
    public TipoTriangulo(){
        super("Tipos de Triângulos");
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.LIGHT_GRAY);
        
        titulo1 = new JLabel("Tipo de Triângulo");
        
        rotulo1 = new JLabel("Lado 1:");
        rotulo2 = new JLabel("Lado 2:");
        rotulo3 = new JLabel("Lado 3:");
        exibir = new JLabel("");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        verificar = new JButton("Verificar Tipo");
        
        titulo1.setBounds(145, 20, 180, 25);
        rotulo1.setBounds(50, 70, 100, 25);
        rotulo2.setBounds(50, 110, 100, 25);
        rotulo3.setBounds(50, 150, 100, 25);
        exibir.setBounds(240, 110, 200, 25);
        
        titulo1.setForeground(Color.DARK_GRAY);
        
        titulo1.setFont(new Font("Arial",Font.BOLD,18));
        exibir.setFont(new Font("Times New Roman",Font.BOLD,14));
        
        verificar.setBounds(50, 190, 150, 25);
        verificar.setBackground(Color.DARK_GRAY);
        verificar.setForeground(Color.WHITE);
        
        texto1.setBounds(100, 70, 100, 25);
        texto2.setBounds(100, 110, 100, 25);
        texto3.setBounds(100, 150, 100, 25);
        
        verificar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a, b, c;
                a = Double.parseDouble(texto1.getText());
                b = Double.parseDouble(texto2.getText());
                c = Double.parseDouble(texto3.getText());
                if(a < b + c && b < a + c && c < a + b){
                    if(a == b && b == c){
                        exibir.setVisible(true);
                        exibir.setText("Triângulo Equilátero");
                    }
                    else if(a == b || a == c || b == c){
                        exibir.setVisible(true);
                        exibir.setText("Triângulo Isóceles");
                    }
                    else{
                        exibir.setVisible(true);
                        exibir.setText("Triângulo Escaleno");
                    }
                }  
                else{
                    exibir.setVisible(true);
                    exibir.setText("Triângulo não identificado.");
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
        tela.add(exibir);
        tela.add(verificar);
        
        setSize(450,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        TipoTriangulo app = new TipoTriangulo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
