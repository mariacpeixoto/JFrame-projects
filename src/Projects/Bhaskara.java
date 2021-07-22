/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskara;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bhaskara extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, titulo1, titulo2, exibir;
    JTextField texto1, texto2, texto3, texto4, texto5;
    JButton calcular;
    
    public Bhaskara(){
        super("Fórmula de Bhaskara");
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.BLACK);
        
        titulo1 = new JLabel("Fórmula de Bhaskara");
        titulo2 = new JLabel("ax² + bx + c = 0");
        
        rotulo1 = new JLabel("Valor do a:");
        rotulo2 = new JLabel("Valor do b:");
        rotulo3 = new JLabel("Valor do c:");
        rotulo4 = new JLabel("x' :");
        rotulo5 = new JLabel("x'' :");
        exibir = new JLabel("");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        texto5 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        
        titulo1.setBounds(160, 20, 180, 25);
        titulo2.setBounds(180, 40, 120, 25);
        rotulo1.setBounds(150, 80, 150, 25);
        rotulo2.setBounds(150, 120, 150, 25);
        rotulo3.setBounds(150, 160, 150, 25);
        rotulo4.setBounds(193, 260, 60, 25);
        rotulo5.setBounds(190, 300, 60, 25);
        exibir.setBounds(180, 340, 200, 25);
        
        titulo1.setForeground(Color.BLUE);
        titulo2.setForeground(Color.BLUE);
        rotulo1.setForeground(Color.WHITE);
        rotulo2.setForeground(Color.WHITE);
        rotulo3.setForeground(Color.WHITE);
        rotulo4.setForeground(Color.WHITE);
        rotulo5.setForeground(Color.WHITE);
        exibir.setForeground(Color.WHITE);
        
        titulo1.setFont(new Font("Times New Roman",Font.BOLD,18));
        titulo2.setFont(new Font("Times New Roman",Font.BOLD,18));
        
        calcular.setBounds(160, 210, 180, 25);
        calcular.setBackground(Color.BLUE);
        calcular.setForeground(Color.WHITE);
        
        texto1.setBounds(220, 80, 100, 25);
        texto2.setBounds(220, 120, 100, 25);
        texto3.setBounds(220, 160, 100, 25);
        texto4.setBounds(220, 260, 100, 25);
        texto5.setBounds(220, 300, 100, 25);
        
        calcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a, b, c, delta, x1, x2;
                a = Double.parseDouble(texto1.getText());
                b = Double.parseDouble(texto2.getText());
                c = Double.parseDouble(texto3.getText());
                delta = (b * b) + (-4 * (a * c));
                if(delta >= 0){
                    x1 = (-(b) + Math.sqrt(delta))/2 * a;
                    x2 = (-(b) - Math.sqrt(delta))/2 * a;
                    
                    texto4.setVisible(true);
                    texto5.setVisible(true);
                    texto4.setText(""+x1);
                    texto5.setText(""+x2);
                }
                else{
                    exibir.setVisible(true);
                    exibir.setText("O delta não possui raiz!");
                }
            }
        });
        
        tela.add(titulo1);
        tela.add(titulo2);
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
        tela.add(exibir);
        
        setSize(500,450);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Bhaskara app = new Bhaskara();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
