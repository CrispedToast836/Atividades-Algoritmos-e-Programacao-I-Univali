package m2AtividadeEmSala03;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        boolean crescente = true;

        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("O vetor está em ordem crescente.");
        } else {
            System.out.println("O vetor não está em ordem crescente.");
        }

        sc.close();
    }
}
