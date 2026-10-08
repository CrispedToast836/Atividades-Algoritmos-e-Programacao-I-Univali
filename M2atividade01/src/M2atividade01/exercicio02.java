package M2atividade01;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int numero, soma = 0, contador = 0;
			String listaNumeros = ""; // 
			double media;
			
			System.out.println("--- Leitura de Números ---");
			System.out.println("O programa parará quando houver 10+ números E soma > 100.");
	
			
			while (contador < 10 || soma <= 100) {
				System.out.print("Digite um número: ");
				numero = sc.nextInt();
				
				soma = soma + numero; 
				contador = contador + 1; 
				
				
				listaNumeros = listaNumeros + numero + " ";
			}
			
			media = (double) soma / contador;
			
			System.out.println("\n--- RESULTADO FINAL ---");
			System.out.println("Números informados: " + listaNumeros);
			System.out.println("Quantidade total: " + contador);
			System.out.println("Soma total: " + soma);
			System.out.printf("Média dos valores: %.2f%n", media);
			
			sc.close();
		}
}
