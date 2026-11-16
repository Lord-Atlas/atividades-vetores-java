import java.util.Scanner;

public class Atividade1 {
    public  static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] vendas = new double[7];
        double total = 0;
        int diaMaiorVenda = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Digite o faturamento do dia " + (i + 1) + ": ");

            vendas[i] = leitor.nextDouble();

            total += vendas[i];

        }

        double maiorVenda = vendas[0];

        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
                diaMaiorVenda = i;

            }
        }

        double media = total / vendas.length;

        System.out.println("Faturamento total: R$ " + total);
        System.out.println("Media diaria: R$ " + media);
        System.out.println("Dia com maior venda: " + (diaMaiorVenda + 1));
        System.out.println("Maior faturamento: R$ " + maiorVenda);

        leitor.close();
    }
}
