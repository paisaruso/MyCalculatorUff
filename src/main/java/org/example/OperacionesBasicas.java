package org.example;

import java.awt.Component;
import javax.swing.JOptionPane;

public class OperacionesBasicas {
    double number1 = 0.0;
    double number2 = 0.0;
    double resultado = 0.0;

    public OperacionesBasicas() {
    }

    private void solicitarNumeros() {
        try {
            this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
            this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog((Component)null, "Por favor, ingrese valores numéricos válidos");
            return;
        }
    }

    public void suma() {
        solicitarNumeros();
        this.resultado = this.number1 + this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    public void resta() {
        solicitarNumeros();
        this.resultado = this.number1 - this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    public void division() {
        solicitarNumeros();
        if (this.number2 == 0) {
            JOptionPane.showMessageDialog((Component)null, "No se puede dividir por cero");
        } else {
            this.resultado = this.number1 / this.number2;
            JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
        }
    }

    public void multiplicacion() {
        solicitarNumeros();
        this.resultado = this.number1 * this.number2;
        JOptionPane.showMessageDialog((Component)null, "El resultado es " + this.resultado);
    }

    // Métodos para pruebas unitarias
    public void suma(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
        this.resultado = this.number1 + this.number2;
    }

    public void resta(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
        this.resultado = this.number1 - this.number2;
    }

    public void division(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
        if (this.number2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        } else {
            this.resultado = this.number1 / this.number2;
        }
    }

    public void multiplicacion(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
        this.resultado = this.number1 * this.number2;
    }
}
