package renan.maratonajava.javacore.Gassociacao.test;

import renan.maratonajava.javacore.Gassociacao.dominio.Jogador;
import renan.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
