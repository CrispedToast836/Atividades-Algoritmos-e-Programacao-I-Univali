package atividade04;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura;
		int idade;
		boolean podeEntrar; 
		
		System.out.println("Qual a sua altura? (ex: 1,45)");
		altura = sc.nextDouble();
		
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		
		
		if (altura >= 1.40 && idade >= 10) {
			podeEntrar = true;
		} else {
			podeEntrar = false;
		}
		
		
		if (podeEntrar) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada não permitida");
		}
		
		sc.close();
	}
}
