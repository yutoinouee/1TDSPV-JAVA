package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploSwitch {
    public static void main(String[] args) {
        //ler dois numeros
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        //ler a operaçao (somar , dividir ,subtrair e multiplicar com switch
        String operacao =JOptionPane.showInputDialog("Escolha um operador(+-/*) ");
        switch (operacao){
            case "+" :
                JOptionPane.showMessageDialog(null, n1 +n2);
                break;
            case "-":
                JOptionPane.showMessageDialog(null, n1 -n2);
                break;
            case "/":
                JOptionPane.showMessageDialog(null,n1/n2);
                if (n2 == 0)
                    JOptionPane.showMessageDialog(null,"Não é possivel dividir");
                else
                    JOptionPane.showMessageDialog(null,n1/n2);
                break;
            case "*":
                JOptionPane.showMessageDialog(null, n1*n2);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");






        //realizar a operacao e exibir o resultado






    }
    }
}
