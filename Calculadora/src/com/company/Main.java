package com.company;

import com.swing.ViewCalc;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ViewCalc");
        frame.setContentPane(new ViewCalc().getPanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Projeto Calculadora Fabio e Silvano");
        frame.setVisible(true);

    }
}
