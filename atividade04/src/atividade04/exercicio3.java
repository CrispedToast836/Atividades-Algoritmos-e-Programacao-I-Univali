package atividade04;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		boolean formaTriangulo; 
		
		System.out.println("Digite o valor do primeiro lado:");
		lado1 = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo lado:");
		lado2 = sc.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado:");
		lado3 = sc.nextDouble();
		

		if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
			formaTriangulo = true;
		} else {
			formaTriangulo = false;
		}
		
		
		if (formaTriangulo) {
			System.out.println("Forma triangulo!");
		} else {
			System.out.println("Não forma triangulo!");
		}
		
		sc.close();
	}
}
