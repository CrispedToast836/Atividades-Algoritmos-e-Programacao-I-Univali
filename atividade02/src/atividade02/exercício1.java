package atividade02;

import java.util.Scanner;

public class exercício1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, soma, media;
		
		System.out.println("Qual sua primeira nota?");
		n1 = sc.nextDouble();
		
		System.out.println("Qual sua segunda nota?");
		n2 = sc.nextDouble();
		
		System.out.println("Qual sua terceira nota?");
		n3 = sc.nextDouble();
		
		soma = n1 + n2 + n3;
		media = soma/3;
		
		System.out.println("Sua média é: " + media);
		
		
		
	}

}
