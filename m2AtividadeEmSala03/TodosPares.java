package m2AtividadeEmSala03;

import java.util.Scanner;

public class TodosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        boolean todosPares = true;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                todosPares = false;
            }
        }

        if (todosPares) {
            System.out.println("Todos os elementos do vetor são pares.");
        } else {
            System.out.println("Nem todos os elementos do vetor são pares.");
        }

        sc.close();
    }
}