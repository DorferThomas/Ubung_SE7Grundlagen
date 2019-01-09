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
        divisionMitTryCatch(9,3);
        divisionMitTryCatch(10,0);
        divisionMitTryCatch(34443443,9);
    }


    public static void divisionMitTryCatch(int a,int b)
    {
        try {
            System.out.println("Das Ergebnis der Division ist: " + (a/b));

            //Im Catch Block kann man zuerst alle Exception verwenden. danch
            //links in der ZeilenNummer den roten Punkt aktivieren, damit das Programm auf dieser Stelle Stehen bleit
            //dann sieht man (in diesem Fall "ArithmeticException) den Fehler und kann diese Exception verwenden.
        }

        //Aufgabe 3:
        catch (NumberFormatException e){
            System.err.println("NumberFormatExeption-Fehler da Divisor oder Divident 0 ist!");
        }
        catch (ArithmeticException e){
            System.err.println("ArithmeticException-Fehler da Divisor oder Divident 0 ist!");
        }
        catch (NullPointerException e){
            System.err.println("NullPointerException-Fehler da Divisor oder Divident 0 ist!");
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("IndexOutOfBoundsException-Fehler da Divisor oder Divident 0 ist!");
        }
    }
}
