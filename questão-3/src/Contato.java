import java.util.Scanner;

public class Contato {
    public int codigo;
    public int numTelefone;
    public int idade;

    Scanner leitor = new Scanner(System.in);
    public Contato(int codigo, int numTelefone, int idade) {
        codigo = leitor.nextInt();
        numTelefone = leitor.nextInt();
        idade = leitor.nextInt();
    }
    }
