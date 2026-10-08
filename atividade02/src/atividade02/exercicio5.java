package atividade02;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("O valor de Delta é: " + delta);
			System.out.printf("O valor de X1 é: %.2f%n", x1);
			System.out.printf("O valor de X2 é: %.2f%n", x2);
		} else {
			System.out.println("Delta é " + delta + ". Não existem raízes reais.");
		}
		
	}
}