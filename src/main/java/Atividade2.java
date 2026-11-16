import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] estoque = new int[10];
        int quantidadeCritica = 0;

        for (int i = 0; i < estoque.length; i++) {

            System.out.print("Digite o estoque do produto " + (i + 1) + ": ");
            estoque[i] = leitor.nextInt();

        }

        System.out.println("\nProdutos com estoque crítico: ");

        for (int i = 0; i < estoque.length; i++){

            if (estoque[i] < 5){

                System.out.println("Produto na posição " + (i + 1) + " possui " + estoque[i] + " unidades.");

                quantidadeCritica++;
            }

        }

        System.out.println("\nTotal de produtos com estoque crítico: " + quantidadeCritica);

        leitor.close();
    }
}
