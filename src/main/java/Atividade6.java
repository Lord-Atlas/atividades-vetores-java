import java.util.Scanner;

public class Atividade6 {

        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            int[] senhas = new int[10];
            boolean[] idosos = new boolean[10];

            for (int i = 0; i < senhas.length; i++) {

                System.out.print("Digite a senha do cliente " + (i + 1) + ": ");
                senhas[i] = leitor.nextInt();

                System.out.print("O cliente é idoso? (s/n): ");
                char resposta = leitor.next().charAt(0);

                idosos[i] = resposta == 's' || resposta == 'S';

            }

            for (int atendimento = 1; atendimento <= 3; atendimento++) {

                int posicaoAtendida = 0;

                for (int i = 0; i < senhas.length; i++) {

                    if (senhas[i] != 0 && idosos[i]) {
                        posicaoAtendida = i;
                        break;
                    }

                }

                System.out.println("\nAtendimento " + atendimento);
                System.out.println("Senha chamada: " + senhas[posicaoAtendida]);

                for (int i = posicaoAtendida; i < senhas.length - 1; i++) {

                    senhas[i] = senhas[i + 1];
                    idosos[i] = idosos[i + 1];

                }

                senhas[senhas.length - 1] = 0;
                idosos[idosos.length - 1] = false;

                System.out.println("Fila atualizada:");

                for (int i = 0; i < senhas.length; i++) {

                    System.out.print(senhas[i] + " ");

                }

                System.out.println();

            }

            leitor.close();

        }
    }


