package m2atividadeEmSala01;
import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        while (palpite != numeroSecreto) {

            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número é MAIOR.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é MENOR.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        }

        scanner.close();
    }
}