import java.util.Scanner;

public class Aluno {
    private int numMatricula;
    private double nota1, nota2, nota3;
    private int frequencia;
    private static final int numAulas = 10;

    Scanner leitor = new Scanner(System.in);

    public Aluno(int numMatricula, double nota1, double nota2, double nota3, int frequencia) {
        numMatricula = leitor.nextInt();
        nota1 = leitor.nextDouble();
        nota2 = leitor.nextDouble();
        nota3 = leitor.nextDouble();
        frequencia = leitor.nextInt();
    }

    public static void verAlunos(){
        System.out.println(alu);
    }

    public static double calcNotaFinal(double nota1, double nota2, double nota3) {
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        return notaFinal;
    }

    public static int calcFrequencia(int frequencia) {
        int frequenciaTotal = frequencia / numAulas;
        return frequenciaTotal;
    }

    public static String aprovaReprova(double notaFinal, int frequenciaTotal) {
        if (notaFinal >= 6.0 && frequenciaTotal >= 0.75) {
            return "Aprovado";
        } else
            return "Reprovado";
    }
}