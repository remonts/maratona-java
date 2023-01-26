package renan.maratonajava.javacore.Aintroducaoclasses.test;

import renan.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carroNovo = new Carro();

        carro.nome = "Fiat Idea";
        carro.modelo = "Idea Adventure";
        carro.ano = 2008;

        carroNovo.nome = "Corsa";
        carroNovo.modelo = "Corsa Sedan";
        carroNovo.ano = 2011;

        System.out.println("Carro 1");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("----------------------------");
        System.out.println("Carro 2");
        System.out.println(carroNovo.nome);
        System.out.println(carroNovo.modelo);
        System.out.println(carroNovo.ano);
    }
}
