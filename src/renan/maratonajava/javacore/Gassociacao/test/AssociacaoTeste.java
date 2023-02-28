package renan.maratonajava.javacore.Gassociacao.test;

import renan.maratonajava.javacore.Gassociacao.dominio.Aluno;
import renan.maratonajava.javacore.Gassociacao.dominio.Local;
import renan.maratonajava.javacore.Gassociacao.dominio.Professor;
import renan.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 18);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
