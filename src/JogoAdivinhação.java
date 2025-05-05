import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhação {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean sucesso = false;

        System.out.println("Bem vindo ao GuessTheNumber");
        System.out.println("Tente advinhar o numero entre 1 e 100");

        while(!sucesso){
            System.out.println("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas ++;

            if (palpite > numeroSecreto){
                System.out.println("Você chutou muito alto.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Você chutou muito baixo.");
            }else {
                sucesso = true;
                System.out.println("Você acertou!!! Você acertou com " + tentativas + " tentativas");
            }
        }

    }
}