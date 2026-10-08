package atividade02;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double alturaDegrau, alturaDesejada, quantidadeDegraus;
		
		System.out.println("Qual a altura de cada degrau (em metros)?");
		alturaDegrau = sc.nextDouble();
		
		System.out.println("Qual a altura total que você deseja alcançar (em metros)?");
		alturaDesejada = sc.nextDouble();
		
		quantidadeDegraus = alturaDesejada / alturaDegrau;
		
		double totalArredondado = Math.ceil(quantidadeDegraus);
		
		System.out.println("--- Resultado ---");
		System.out.println("Para atingir " + alturaDesejada + "m, você precisará subir:");
		System.out.printf("%.0f degraus.%n", totalArredondado);
		
	}

}