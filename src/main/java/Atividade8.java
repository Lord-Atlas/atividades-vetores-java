import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] filial1 = new double[5];
        double[] filial2 = new double[5];
        double[] relatorio = new double[10];

        for (int i = 0; i < filial1.length; i++) {

            System.out.print("Digite a venda da filial 1 (ordem crescente): ");
            filial1[i] = leitor.nextDouble();

        }

        for (int i = 0; i < filial2.length; i++) {

            System.out.print("Digite a venda da filial 2 (ordem crescente): ");
            filial2[i] = leitor.nextDouble();

        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < filial1.length && j < filial2.length) {

            if (filial1[i] < filial2[j]) {

                relatorio[k] = filial1[i];
                i++;

            } else {

                relatorio[k] = filial2[j];
                j++;

            }

            k++;

        }

        while (i < filial1.length) {

            relatorio[k] = filial1[i];
            i++;
            k++;

        }

        while (j < filial2.length) {

            relatorio[k] = filial2[j];
            j++;
            k++;

        }

        System.out.println("\nRELATÓRIO UNIFICADO");

        for (int x = 0; x < relatorio.length; x++) {

            System.out.printf("Venda: R$ %.2f%n", relatorio[x]);

        }

        leitor.close();

    }
}

