package com.company;

import javax.swing.*;
import java.awt.*;

public class PedradaGUI extends JFrame {
    public static void main(String args[]) {



        JFrame janelaPrincipal= new JFrame("POO");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel norteLabel= new JLabel("Rede Social-PedradaDigital", JLabel.CENTER);

        JPanel contentorLabel = new JPanel();

        JTextArea text=new JTextArea(35,68);
        JLabel Pedra= new JLabel("PedraDigital>", JLabel.LEFT);
        JTextField campoPedra= new JTextField(60);

        JPanel labelcinza= new JPanel();
        labelcinza.setBackground(Color.GRAY);


        contentorLabel.add(text,BorderLayout.CENTER);
        contentorLabel.add(campoPedra);
        contentorLabel.add(Pedra);

        JLabel mesageLabel=new JLabel("Mensagem", JLabel.CENTER);


        JPanel contentorBtn = new JPanel(new GridBagLayout() );
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 12, 4, 12);

        JButton LoginBtn = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.0;

        contentorBtn.add(LoginBtn, gbc);

        JButton ExecutBtn = new JButton("Executar");
        gbc.gridx = 0;
        gbc.gridy = 2;

        contentorBtn.add(ExecutBtn, gbc);

        JButton LogoutBtn = new JButton("Logout");
        gbc.gridx = 0;
        gbc.gridy = 3;

        contentorBtn.add(LogoutBtn, gbc);


        contentorLabel.setBackground(Color.GRAY);
        janelaPrincipal.setSize(900,700);
        janelaPrincipal.add(norteLabel, BorderLayout.NORTH);
        janelaPrincipal.add(contentorLabel, BorderLayout.CENTER);
        janelaPrincipal.add(contentorBtn, BorderLayout.EAST);
        janelaPrincipal.add(mesageLabel, BorderLayout.SOUTH);
        janelaPrincipal.add(labelcinza, BorderLayout.WEST);
        janelaPrincipal.setVisible(true);

    }

}

