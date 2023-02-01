package renan.maratonajava.javacore.Bintroducaometodos.test;

import renan.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Renan");
        funcionario.setIdade(29);
        funcionario.setSalarios(new double[]{3000.0, 4000.0, 4500.0});

        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
