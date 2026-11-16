import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] notas = new int[10];
        int[] frequencia = new int[11];

        int maiorVotacao = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota do cliente " + (i + 1) + "(0 a 10): ");
            notas[i] = leitor.nextInt();

            while (notas[i] < 0 || notas[i] > 10) {
                System.out.print("Nota inválida! Digite uma nota de 0 a 10: ");
                notas[i] = leitor.nextInt();

            }

            frequencia[notas[i]]++;

        }

        System.out.println("\nRESULTADO DA PESQUISA ");

        for (int i = 0; i < frequencia.length; i++) {
            System.out.println("Nota " + i + "apareceu " + frequencia[i] + "vez(es).");

            if (frequencia[i] > maiorVotacao) {
              maiorVotacao = frequencia[i];

            }
        }

        System.out.println("\nNotas mais votadas: ");

        for (int i = 0; i < frequencia.length; i++) {

            if (frequencia[i] == maiorVotacao) {
                System.out.println("Nota " + i + " com " + maiorVotacao + " votos.");
            }
        }
        leitor.close();
    }
}
