package renan.maratonajava.javacore.Bintroducaometodos.test;


import renan.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        pessoa.imprime();
    }
}