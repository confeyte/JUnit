package br.edu.aula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void preparar() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Somar")
    void testarSoma() {
        assertEquals(30, calculadora.somar(10, 20));
    }

    @Test
    @DisplayName("Subtrair")
    void testarSubtracao() {
        assertEquals(15, calculadora.subtrair(20, 5));
    }

    @Test
    @DisplayName("Par")
    void testarPar() {
        assertTrue(calculadora.ehPar(8));
    }

    @Test
    @DisplayName("Ímpar")
    void testarImpar() {
        assertFalse(calculadora.ehPar(7));
    }

    @Test
    @DisplayName("Média 7 aprova")
    void testarAprovacao() {
        assertTrue(calculadora.estaAprovado(7));
    }

    @Test
    @DisplayName("Média 6,9 reprova")
    void testarReprovacao() {
        assertFalse(calculadora.estaAprovado(6.9));
    }
}
