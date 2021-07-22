/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojlabel;

/**
 *
 * @author maria
 */
import javax.swing.*;
import java.awt.*;

public class ExemploJLabel extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    
    public ExemploJLabel(){
        super("Exemplo com Label");
        ImageIcon icone = new ImageIcon("forms.png");
        setIconImage(icone.getImage());
        setSize(300, 150);
        setVisible(true);
    
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Nome: ");
        rotulo2 = new JLabel("Idade: ");
        rotulo3 = new JLabel("Telefone: ");
        rotulo4 = new JLabel("Celular: ");
        rotulo1.setBounds(50, 20, 80, 20);
        rotulo2.setBounds(50, 60, 80, 20);
        rotulo3.setBounds(50, 100, 80, 20);
        rotulo4.setBounds(50, 140, 80, 20);
        rotulo1.setForeground(Color.BLACK);
        rotulo2.setForeground(Color.BLACK);
        rotulo3.setForeground(Color.BLACK);
        rotulo4.setForeground(Color.BLACK);
        rotulo1.setFont(new Font("Times New Roman",Font.BOLD,16));
        rotulo2.setFont(new Font("Times New Roman",Font.BOLD,16));
        rotulo3.setFont(new Font("Times New Roman",Font.BOLD,16));
        rotulo4.setFont(new Font("Times New Roman",Font.BOLD,16));
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        ExemploJLabel app = new ExemploJLabel();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
