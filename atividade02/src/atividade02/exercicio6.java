package atividade02;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioBase, gratificacao, imposto, salarioReceber;
		
		System.out.println("Digite o salário base do funcionário:");
		salarioBase = sc.nextDouble();
	
		gratificacao = salarioBase * 0.05;
		
		imposto = salarioBase * 0.07;
		
		salarioReceber = salarioBase + gratificacao - imposto;
		
		System.out.printf("Salário Base: R$%.2f%n", salarioBase);
		System.out.printf("Gratificação (5%%):R$%.2f%n", gratificacao);
		System.out.printf("Imposto (7%%): R$%.2f%n", imposto);
		System.out.printf("Salário a Receber: R$%.2f%n", salarioReceber);
		
	}
}