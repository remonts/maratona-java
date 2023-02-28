package renan.maratonajava.javacore.Hheranca.test;

import renan.maratonajava.javacore.Hheranca.dominio.Endereco;
import renan.maratonajava.javacore.Hheranca.dominio.Funcionario;
import renan.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4100.25);

        System.out.println("-----------------");
        funcionario.imprime();
    }
}
