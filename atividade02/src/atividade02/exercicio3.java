package atividade02;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero, parteFracionaria;
		int parteInteira;
		long arredondado;
		
		System.out.println("Digite um número real:");
		numero = sc.nextDouble();
		
		parteInteira = (int) numero;
		
		parteFracionaria = numero - parteInteira;
		
		arredondado = Math.round(numero);
		
		System.out.println("A parte inteira é: " + parteInteira);
		System.out.println("A parte fracionária é: " + parteFracionaria);
		System.out.println("O arredondamento é: " + arredondado);
		
	}
}