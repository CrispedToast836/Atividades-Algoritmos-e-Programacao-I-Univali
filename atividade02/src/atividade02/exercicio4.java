package atividade02;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero, quadrado, cubo, raizQuadrada, raizCubica;
		
		System.out.println("Digite um número positivo e maior que zero:");
		numero = sc.nextDouble();
		
		quadrado = Math.pow(numero, 2);
		cubo = Math.pow(numero, 3);
		raizQuadrada = Math.sqrt(numero);
		raizCubica = Math.cbrt(numero);
		
		System.out.println("O número ao quadrado é: " + quadrado);
		System.out.println("O número ao cubo é: " + cubo);
		System.out.println("A raiz quadrada é: " + raizQuadrada);
		System.out.println("A raiz cúbica é: " + raizCubica);
		
	}
}
