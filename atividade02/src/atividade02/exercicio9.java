package atividade02;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Digite o seu peso (em kg):");
		peso = sc.nextDouble();
		
		System.out.println("Digite a sua altura (em metros, ex: 1,75):");
		altura = sc.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		
		System.out.printf("Seu IMC é: %.2f%n", imc);
		
		
		if (imc < 18.5) {
			System.out.println("Classificação: Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Classificação: Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Classificação: Sobrepeso");
		} else {
			System.out.println("Classificação: Obesidade");
		}

		
	}
}