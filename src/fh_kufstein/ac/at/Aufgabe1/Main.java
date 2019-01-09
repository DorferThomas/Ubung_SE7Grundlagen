package fh_kufstein.ac.at.Aufgabe1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie den Dividend A ein: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie den Divisor  B ein: "));

        if ((a&b)==0)
        {
            System.err.println("Einer der eingegebenen Werte ist ungültig, mit 0 kann nicht gerechnet werden!");
        }else {
            System.out.println("Das Ergebnis der Division ist: \n" + (a/b));
        }
    }
}
