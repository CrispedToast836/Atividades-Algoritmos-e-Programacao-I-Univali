package atividade02;

import java.util.Scanner;

public class exercicio2{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, perimetro;
		
		System.out.println("Digite o valor do raio do círculo:");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		perimetro = 2 * Math.PI * raio;
		
		System.out.println("A área do círculo é: "+ area);
		
		System.out.println("O perímetro do círculo é: " + perimetro);
		

	}
}