package renan.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi
o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Renan";
        String endereço = "Rua Maria Amélia de Carvalho, 356";
        double salario = 4030.31;
        String dataRecebimentoSalario = "10/01/2023";
        String relatorio = "Eu " + nome + "," + " morando no endereço " + endereço + ", confirmo que recebi\n" +
                "o salário de " + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);
    }
}
