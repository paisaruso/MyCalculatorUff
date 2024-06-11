package org.example;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
    static int option;
    static String menu;

    public Main() {
    }

    public static void main(String[] args) {
        OperacionesBasicas object = new OperacionesBasicas();

        do {
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n1. Suma\n2. Resta\n3. División\n4 Multiplicación\n5. Salir");
            option = Integer.parseInt(menu);
            switch (option) {
                case 0:
                    object.integrales();
                case 1:
                    object.suma();
                    break;
                case 2:
                    object.resta();
                    break;
                case 3:
                    object.division();
                    break;
                case 4:
                    object.multiplicacion();
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog((Component)null, "La opción " + option + " es incorrecta");
            }
        } while(option != 5);

    }
}