package fh_kufstein.ac.at.Aufgabe1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie den Dividend A ein: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie den Divisor  B ein: "));
        System.out.println("Aufgabe 1:___________________________________________________________________");

        if ((a==0)||(b==0))
        {
            System.err.println("Einer der eingegebenen Werte ist ungültig, mit 0 kann nicht gerechnet werden!");
        }else {
            System.out.println("Das Ergebnis der Division ist: \n" + (a/b) + "\n");
        }
        System.out.println("Aufgabe 2:___________________________________________________________________");
        divisionMitTryCatch(30,3);
        divisionMitTryCatch(10,0);
    }

    public static void divisionMitTryCatch(int a,int b)
    {
        try {
            System.out.println("Das Ergebnis der Division ist: " + (a/b));

        }catch (Exception e){
            System.err.println("Fehler da Divisor oder Divident 0 ist!");
        }
    }
}
