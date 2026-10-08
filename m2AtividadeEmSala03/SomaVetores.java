package m2AtividadeEmSala03;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho dos vetores: ");
        int tamanho = sc.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] soma = new int[tamanho];

        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            soma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor soma:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(soma[i] + " ");
        }

        sc.close();
    }
}