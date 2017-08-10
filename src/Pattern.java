/**
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 10. November 2016
 * Purpose: Loesung Praktikumseinheit 03: Pattern
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

public class Pattern {

    public static void main(String[] args) {

        // Anlegen und initialisieren/berechnen der benoetigten Variablen
        int size = Integer.parseInt(args[0]);	        // Einlesen der Groesse des Patterns.
        size = Math.abs(size);					        // eine eventuell negative Pattern-Groesse wird zu einer positiven gemacht
        int countLines = 0;						        // Zeilenzaehler. Der Zaehler beginnt mit Zeile 1
        int countCharacters = 0;                        // Zeichenzaehler. Der Zaehler zaehlt die bereits erzeugten Zeichen in jeder Zeile.
        int counterConterX = size - 1;                  // Zaehler fuer die zweiten X in jeder Zeile. Dieser Zaehler zaehlt rueckwaerts

        // Pruefen, ob die eingegebene Groesse gerade oder 0 ist. Sollte dem so sein, wird eine Fehlermeldung ausgegeben.
        if ((size == 0) || (size % 2 == 0)) {

            System.out.println("Invalid Input");

        }
        else {

            for (int i = 0; i < size; i++) {        // Erzeugt die Zeilen

                for (int j = 0; j < size; j++) {    // Erzeugt die Zeichen einer Zeile

                    /**
                     * Es wird immer dann ein X ausgegeben, wenn entweder die gezaehlten Zeichen dem Zeilenzaehler entsprechen,
                     * oder wenn die gezaehlten Zeichen dem Zaehler fuer das zweite X in jeder Zeile entsprechen.
                     */
                    if (countCharacters == countLines || countCharacters == counterConterX) {

                        System.out.print('X');
                        countCharacters++;

                    }
                    /**
                     * Trifft keine der Bedingungen fuer das Erzeugen eines X zu und sollen aber noch Zeichen in der Zeile
                     * erzeugt werden, so soll in jedem Fall ein Punkt erzeugt werden.
                     */
                    else {

                        System.out.print('.');
                        countCharacters++;

                    }
                }

                countCharacters = 0;                // Nach jeder erzeugten Zeile muss der Zeichen-Counter zurueckgesetzt werden.
                counterConterX--;
                countLines++;
                System.out.println();

            }
        }
    }
}
