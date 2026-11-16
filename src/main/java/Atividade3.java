import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] codigos = new int[5];
        double[] precos = new double[5];

        for (int i = 0; i < codigos.length; i++) {

            System.out.print("Digite o código do produto " + (i + 1) + ": ");
            codigos[i] = leitor.nextInt();

            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = leitor.nextDouble();

        }

        System.out.print("\nDigite o código que deseja consultar: ");
        int codigoBusca = leitor.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < codigos.length; i++) {

            if (codigos[i] == codigoBusca) {

                System.out.println("Preço do produto: R$ " + precos[i]);

                encontrado = true;
                break;

            }

        }

        if (!encontrado) {

            System.out.println("Produto não cadastrato. ");

        }

        leitor.close();
    }
}
