package org.example;

import java.awt.Component;
import javax.swing.JOptionPane;

public class OperacionesBasicas {
    double number1 = 0.0;
    double number2 = 0.0;
    double resultado = 0.0;

    public OperacionesBasicas() {
    }

    public void suma() {
        this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        this.resultado = this.number1 + this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    public void resta() {
        this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        this.resultado = this.number1 - this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    public void division() {
        this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        this.resultado = this.number1 / this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    public void multiplicacion() {
        this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        this.resultado = this.number1 * this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    public void integrales() {
    }
}

