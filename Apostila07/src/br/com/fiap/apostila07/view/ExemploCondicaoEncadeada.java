package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {

    public static void main(String[] args) {
        //ler a media final do aluno
        //dizer se o aluno esta aprovado >=6
        //exame >=4 e <=5.9
        //retido<4
        String notaStr = JOptionPane.showInputDialog("Digite a media final do aluno:");
        double nota = Double.parseDouble(notaStr);

        if (nota >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado!");
        } else if (nota >= 4 && nota <= 5.9) {
            JOptionPane.showMessageDialog(null, "Em exame.");

        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");


        }
    }//main
}//class

