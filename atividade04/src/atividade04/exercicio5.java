package atividade04;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorCompra, percentualDesconto, valorDesconto, valorFinal;
		boolean ehVip;
		
		System.out.println("Qual o valor da compra?");
		valorCompra = sc.nextDouble();
		
		System.out.println("É cliente VIP? (digite true para sim ou false para não)");
		ehVip = sc.nextBoolean();
		
		
		if (ehVip && valorCompra > 200) {
			
			percentualDesconto = 10;
		} else if (ehVip || valorCompra > 200) {
			
			percentualDesconto = 5;
		} else {
			
			percentualDesconto = 0;
		}
		
		
		valorDesconto = valorCompra * (percentualDesconto / 100);
		valorFinal = valorCompra - valorDesconto;
		
		
		System.out.println("--- Extrato da Compra ---");
		System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
		System.out.printf("Percentual de desconto aplicado: %.0f%%%n", percentualDesconto);
		System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
		System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
		
		sc.close();
	}
}
