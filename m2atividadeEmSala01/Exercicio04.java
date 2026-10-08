package m2atividadeEmSala01;

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha as opçoes de 1 a 5");
            System.out.println(" >>>>>>> 1 - CADASTRAR <<<<<<<");
            System.out.println(" >>>>>>> 2 - CONSULTAR <<<<<<<");
            System.out.println(" >>>>>>> 3 - ATUALIZAR <<<<<<<");
            System.out.println(" >>>>>>> 4 - EXCLUIR <<<<<<<");
            System.out.println(" >>>>>>> 5 - SAIR <<<<<<<");
            escolha= sc.nextInt();

            if (escolha>=1 && escolha<=5) {
                switch (escolha) {
                    case 1:
                        System.out.println("Cadastro Efetuado");
                        break;
                    case 2: 
                        System.out.println("Consulta realizada");
                        break;
                    case 3: 
                        System.out.println("Atualização realizada");
                        break;
                    case 4: 
                        System.out.println("Exclusão realizada");
                        break;
                    case 5:
                        System.out.println("Finalizando o programa...");
                        break;
                }
            }else 
                System.out.println("Por favor digite uma nota valida");
                
        } while (escolha!=5);
        
        sc.close();
    }
}
