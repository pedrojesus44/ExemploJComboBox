/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojcombobox2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Admin
 */
public class ExemploJComboBox2 extends JFrame {
    JComboBox lista;
    String cidades[] = {"Rio de Janeiro","São Paulo","Minas Gerais", "Espírito Santo",
        "Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JButton limpar;
    JLabel rotulo;
    public ExemploJComboBox2() {
        super("Exemplo de JComboBox");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        limpar = new JButton("Limpar");
        rotulo = new JLabel("");
        lista = new JComboBox(cidades);
        lista.setEditable(true);
        lista.setMaximumRowCount(5);
        lista.setBounds(50,50,150,30);
        exibir.setBounds(270,60,100,30);
        limpar.setBounds(270,100,100,30);
        rotulo.setBounds(50,150,200,30);
        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotulo.setText("o estado é: " +lista.getSelectedItem().toString());
            }});
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotulo.setText(null);
            }
        });
        tela.add(lista);
        tela.add(exibir);
        tela.add(limpar);
        tela.add(rotulo);
        setSize(400, 250);
        setVisible(true);
    }
    
   public static void main(String args[]) {
       ExemploJComboBox2 app = new ExemploJComboBox2();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
