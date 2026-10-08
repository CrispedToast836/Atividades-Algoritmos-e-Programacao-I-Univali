package m2AtividadeEmSala03;

import java.util.Scanner;

public class JuntarVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do primeiro vetor: ");
        int tamanhoA = sc.nextInt();

        System.out.print("Informe o tamanho do segundo vetor: ");
        int tamanhoB = sc.nextInt();

        int[] vetorA = new int[tamanhoA];
        int[] vetorB = new int[tamanhoB];
        int[] vetorC = new int[tamanhoA + tamanhoB];

        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < tamanhoA; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < tamanhoB; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanhoA; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < tamanhoB; i++) {
            vetorC[tamanhoA + i] = vetorB[i];
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        sc.close();
    }
}