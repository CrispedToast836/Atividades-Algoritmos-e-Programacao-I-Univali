package M2atividade01;

import java.util.Random;
import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			
			
			int numeroSecreto = random.nextInt(100) + 1;
			int palpite;
			int tentativas = 0;
			
			System.out.println("--- JOGO DA ADIVINHAÇÃO ---");
			System.out.println("Tente adivinhar o número secreto entre 1 e 100!");
	
			
			do {
				System.out.print("Digite seu palpite: ");
				palpite = sc.nextInt();
				tentativas++; 
				
				if (palpite < numeroSecreto) {
					System.out.println("O número secreto é MAIOR que " + palpite);
				} else if (palpite > numeroSecreto) {
					System.out.println("O número secreto é MENOR que " + palpite);
				} else {
					System.out.println("PARABÉNS! Você acertou em " + tentativas + " tentativas.");
				}
				
			} while (palpite != numeroSecreto);
			
			sc.close();
		}
}
