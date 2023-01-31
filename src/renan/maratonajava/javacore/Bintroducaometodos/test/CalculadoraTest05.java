package renan.maratonajava.javacore.Bintroducaometodos.test;

import renan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        //o metodo abaixo aceita apenas arrays como parametros
        calculadora.somaArray(numeros);
        //varArgs = varios argumentos passados por parametro
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
