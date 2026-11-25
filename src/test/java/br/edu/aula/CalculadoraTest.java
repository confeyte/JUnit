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

    // ===== Testes originais =====

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

    // ===== Etapa 2 =====

    // Exercício 1
    @Test
    @DisplayName("Somar dois números negativos")
    void testarSomaNegativos() {
        assertEquals(-30, calculadora.somar(-10, -20));
    }

    // Exercício 2
    @Test
    @DisplayName("Somar um número com zero")
    void testarSomaComZero() {
        assertEquals(15, calculadora.somar(15, 0));
    }

    // Exercício 3
    @Test
    @DisplayName("Zero é par")
    void testarZeroEhPar() {
        assertTrue(calculadora.ehPar(0));
    }

    @Test
    @DisplayName("-3 não é par")
    void testarNegativoImpar() {
        assertFalse(calculadora.ehPar(-3));
    }

    // Exercício 4 (valor limite)
    @Test
    @DisplayName("Média 6,9 está abaixo do limite: reprovado")
    void testarLimiteAbaixo() {
        assertFalse(calculadora.estaAprovado(6.9));
    }

    @Test
    @DisplayName("Média 7,0 está no limite: aprovado")
    void testarLimiteExato() {
        assertTrue(calculadora.estaAprovado(7.0));
    }

    @Test
    @DisplayName("Média 7,1 está acima do limite: aprovado")
    void testarLimiteAcima() {
        assertTrue(calculadora.estaAprovado(7.1));
    }

    // ===== Etapa 3 =====

    // Exercício 5
    @Test
    @DisplayName("Multiplicar 5 x 4")
    void testarMultiplicacao() {
        assertEquals(20, calculadora.multiplicar(5, 4));
    }

    @Test
    @DisplayName("Multiplicar por zero")
    void testarMultiplicacaoPorZero() {
        assertEquals(0, calculadora.multiplicar(8, 0));
    }

    @Test
    @DisplayName("Multiplicar número negativo")
    void testarMultiplicacaoNegativa() {
        assertEquals(-15, calculadora.multiplicar(-3, 5));
    }

    // Exercício 6
    @Test
    @DisplayName("17 anos não é maior de idade")
    void testarMenorDeIdade() {
        assertFalse(calculadora.ehMaiorDeIdade(17));
    }

    @Test
    @DisplayName("18 anos é maior de idade (limite)")
    void testarIdadeLimite() {
        assertTrue(calculadora.ehMaiorDeIdade(18));
    }

    @Test
    @DisplayName("25 anos é maior de idade")
    void testarMaiorDeIdade() {
        assertTrue(calculadora.ehMaiorDeIdade(25));
    }
}