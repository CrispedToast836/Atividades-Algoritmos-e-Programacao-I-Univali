package atividade02;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pesoSacoKg, pesoSacoGramas, racaoGato1, racaoGato2, totalConsumido, sobra;
		
		System.out.println("Qual o peso do saco de ração (em quilos)?");
		pesoSacoKg = sc.nextDouble();
		
		System.out.println("Quantidade de ração para o primeiro gato (em gramas):");
		racaoGato1 = sc.nextDouble();
		
		System.out.println("Quantidade de ração para o segundo gato (em gramas):");
		racaoGato2 = sc.nextDouble();
		
		pesoSacoGramas = pesoSacoKg * 1000;
		
		totalConsumido = (racaoGato1 + racaoGato2) * 5;
		
		sobra = pesoSacoGramas - totalConsumido;
		
		System.out.println("Total de ração consumida: " + totalConsumido + "g");
		
		if (sobra >= 0) {
			System.out.println("Restará no saco: " + sobra + " gramas (" + (sobra / 1000) + " kg)");
		} else {
			System.out.println("Atenção: A ração vai acabar antes dos 5 dias!");
			System.out.println("Faltarão: " + Math.abs(sobra) + " gramas" );
		}
		
		
	}
}