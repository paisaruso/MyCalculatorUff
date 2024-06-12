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
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n1. Suma\n2. Resta\n3. División\n4. Multiplicación\n5. Salir");
            try {
                option = Integer.parseInt(menu);
                switch (option) {
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
                        break;
                    case 5:
                        // Salir
                        break;
                    default:
                        JOptionPane.showMessageDialog((Component) null, "La opción " + option + " es incorrecta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog((Component) null, "Por favor, ingrese un número válido");
            }
        } while (option != 5);
    }
}
