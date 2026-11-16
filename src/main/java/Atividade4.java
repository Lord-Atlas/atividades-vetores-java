import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        double[] salariosAntes = new double[8];
        double[] salariosDepois = new double[8];

        double aumetoTotal = 0;

        for (int i = 0; i < salariosAntes.length; i++) {

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salariosAntes[i] = leitor.nextDouble();

            salariosDepois[i] = salariosAntes[i] * 1.10;

            if (salariosDepois[i] > 5000) {
                salariosDepois[i] = 5000;

            }

            aumetoTotal += salariosDepois[i] - salariosAntes[i];

        }

        System.out.println("\nRelatorio de salários");

        for (int i = 0; i < salariosAntes.length; i++) {

            System.out.printf("\nFuncionário %d%n", (i + 1));
            System.out.printf("Salário antes: R$ %.2f%n", salariosAntes[i]);
            System.out.printf("Salário depois: R$ %.2f%n", salariosDepois[i]);

        }

        System.out.printf("\nAumento total da folha: R$ %.2f%n", aumetoTotal);

        leitor.close();

    }
}
