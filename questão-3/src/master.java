import java.util.ArrayList;
import java.util.Scanner;

public class master {

    public static ArrayList<Contato> contatos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== MENU === \n");
        System.out.println("1) Para criar um novo contato.\n" +
                "2) Para remover um contato.\n" +
                "3) Para editar um contato.\n" +
                "4) Para encerrar a aplicação\n");

        Scanner leitor = new Scanner(System.in);
        int i = leitor.nextInt();

        while (i != 4) {
            switch (i) {
                case 1 -> {
                    System.out.println("Insira o código, o número de telefone e a idade do novo contato");
                    Contato novo = new Contato(int codigo, int numTelefone, int idade);
                    contatos.add(novo);
                    i = leitor.nextInt();
                }
                case 2 -> {
                    System.out.println("Insira o índice do contato que deseja remover.");
                    int rmv = leitor.nextInt();
                    contatos.remove(rmv);
                    i = leitor.nextInt();
                }
                case 3 -> {
                    System.out.println("Insira o índice do contato que deseja editar.");
                    int edt = leitor.nextInt();
                    System.out.println("Insira o código, o número de telefone e a idade do novo contato");
                    Contato editado = new Contato(int codigo, int numTelefone, int idade);
                    contatos.add(edt, editado);
                        i = leitor.nextInt();
                    }
                }
                default -> {
                    System.out.println("Informe um número válido.");

                    i = leitor.nextInt();
                }
            }
        }
    }
}