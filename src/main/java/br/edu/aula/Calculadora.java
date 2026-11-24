package br.edu.aula;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public boolean estaAprovado(double media) {
        return media >= 7.0;
    }
}
