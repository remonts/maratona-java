package renan.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        char caractere1 = '\u0042';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println("Char " + caractere);
        System.out.println("Char " + caractere1);
        System.out.println(nome);
    }
}
