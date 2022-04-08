import java.util.Scanner;

public class master {

    public static void main(String[] args) {

        double valores[] = new double[3];
        int i;

        Scanner leValores = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            valores[i] = leValores.nextDouble();
        }
        System.out.println("Dados na ordem em que foram inseridos: " + valores[0] + "; "
                + valores[1] + "; " + valores[2]);

        double aux1;
        for (int x = 0; x < 3; x++) {
            for (int y = x + 1; y < valores.length; y++) {
                if (valores[x] > valores[y]) {
                    aux1 = valores[x];
                    valores[x] = valores[y];
                    valores[y] = aux1;
                }
            }
        }
        System.out.println("Dados em ordem crescente: " + valores[0] + "; "
                + valores[1] + "; " + valores[2]);

        double aux2;
        for (int x = 0; x < 3; x++) {
            for (int y = x + 1; y < valores.length; y++) {
                if (valores[x] < valores[y]) {
                    aux2 = valores[x];
                    valores[x] = valores[y];
                    valores[y] = aux2;
                }
            }
        }
        System.out.println("Dados em ordem decrescente: " + valores[0] + "; "
                + valores[1] + "; " + valores[2]);
    }
}