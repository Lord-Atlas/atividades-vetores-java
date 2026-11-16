import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[6];
        double[] vendas = new double[6];

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Digite o nome do vendedor " + (i + 1) + ": ");
            nomes[i] = leitor.nextLine();

            System.out.print("Digite o total vendido: R$ ");
            vendas[i] = leitor.nextDouble();

            leitor.nextLine();

        }

        for (int i = 0; i < vendas.length - 1; i++) {

            for (int j = i + 1; j < vendas.length; j++) {

                if (vendas[j] > vendas[i]) {

                    double auxiliarVenda = vendas[i];
                    vendas[i] = vendas[j];
                    vendas[j] = auxiliarVenda;

                    String auxiliarNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = auxiliarNome;

                }

            }

        }

        System.out.println("\nRANKING DE VENDEDORES");

        for (int i = 0; i < nomes.length; i++) {

            System.out.printf("%dº lugar: %s - R$ %.2f%n",
                    (i + 1), nomes[i], vendas[i]);

        }

        leitor.close();

    }
}
