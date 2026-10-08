package M2atividade01;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int nota, totalRespostas = 0, somaNotas = 0;
			int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0;
			double media;
			
			System.out.println("--- Pesquisa de Satisfação ---");
			System.out.println("Digite as notas de 1 a 5 (ou 0 para encerrar):");
	
			while (true) {
				System.out.print("Nota do cliente: ");
				nota = sc.nextInt();
				
				
				if (nota == 0) {
					break;
				}
				
				
				if (nota == 1) {
					nota1++;
					totalRespostas++;
					somaNotas += nota;
				} else if (nota == 2) {
					nota2++;
					totalRespostas++;
					somaNotas += nota;
				} else if (nota == 3) {
					nota3++;
					totalRespostas++;
					somaNotas += nota;
				} else if (nota == 4) {
					nota4++;
					totalRespostas++;
					somaNotas += nota;
				} else if (nota == 5) {
					nota5++;
					totalRespostas++;
					somaNotas += nota;
				} else {
					System.out.println("Nota inválida! Por favor, digite de 1 a 5.");
				}
			}
			
			
			System.out.println("\n--- RELATÓRIO DA PESQUISA ---");
			System.out.println("Quantidade de respostas: " + totalRespostas);
			
			if (totalRespostas > 0) {
				media = (double) somaNotas / totalRespostas;
				System.out.printf("Média de satisfação: %.2f%n", media);
				System.out.println("Distribuição das notas:");
				System.out.println("Nota 1: " + nota1 + " vez(es)");
				System.out.println("Nota 2: " + nota2 + " vez(es)");
				System.out.println("Nota 3: " + nota3 + " vez(es)");
				System.out.println("Nota 4: " + nota4 + " vez(es)");
				System.out.println("Nota 5: " + nota5 + " vez(es)");
			} else {
				System.out.println("Nenhuma nota válida foi registrada.");
			}
			
			sc.close();
		}
}
