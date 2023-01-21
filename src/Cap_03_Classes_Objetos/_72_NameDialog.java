package Cap_03_Classes_Objetos;

import javax.swing.*;

public class _72_NameDialog {

    public static void main(String[] args) {
        //pede para o usuário inserir seu nome
        String nome = JOptionPane.showInputDialog("Qual seu nome: ");

        //Criação da msg
        String mensagem = String.format("Bem vindo a programação Java %s.", nome);

        //exibição da mensagem em janela
        JOptionPane.showMessageDialog(null, mensagem);

        //Está é uma segunda forma de fazer a mesma coisa sendo mais direto
        //JOptionPane.showMessageDialog(null, String.format("Bem vindo a programação %s", nome));
    }
}
