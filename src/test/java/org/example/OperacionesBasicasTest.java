package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesBasicasTest {

    private OperacionesBasicas operaciones;

    @BeforeEach
    public void setUp() {
        operaciones = new OperacionesBasicas();
    }

    @Test
    public void testSuma() {
        operaciones.suma(2.0, 3.0);
        assertEquals(5.0, operaciones.resultado, 0.001);
    }

    @Test
    public void testResta() {
        operaciones.resta(5.0, 3.0);
        assertEquals(2.0, operaciones.resultado, 0.001);
    }

    @Test
    public void testDivision() {
        operaciones.division(6.0, 3.0);
        assertEquals(2.0, operaciones.resultado, 0.001);
    }

    @Test
    public void testMultiplicacion() {
        operaciones.multiplicacion(2.0, 3.0);
        assertEquals(6.0, operaciones.resultado, 0.001);
    }

    @Test
    public void testDivisionPorCero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            operaciones.division(6.0, 0.0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
