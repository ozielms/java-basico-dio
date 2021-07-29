package one.digitainnovation.classes;

import javax.swing.*;

import static java.lang.System.exit;

public class Programa {
    public static void main(String[] args) {
        String nome;
        String sobrenome;

        nome = JOptionPane.showInputDialog("Digite o nome");
        sobrenome = JOptionPane.showInputDialog("Sobrenome");
        JOptionPane.showMessageDialog(null, "Obrigado " + nome + " " + sobrenome +".");

        exit(0);

    }
}
