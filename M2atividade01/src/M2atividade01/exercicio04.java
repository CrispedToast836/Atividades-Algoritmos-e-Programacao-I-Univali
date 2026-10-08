package M2atividade01;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int opcao = 0;
			
			
			while (opcao != 5) {
				
				System.out.println("\n--- MENU DE CADASTRO ---");
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Consultar");
				System.out.println("3 - Atualizar");
				System.out.println("4 - Excluir");
				System.out.println("5 - Sair");
				System.out.print("Escolha uma opção: ");
				
				opcao = sc.nextInt();
				
				
				switch (opcao) {
					case 1:
						System.out.println("Cadastro efetuado.");
						break;
					case 2:
						System.out.println("Consulta realizada.");
						break;
					case 3:
						System.out.println("Atualização realizada.");
						break;
					case 4:
						System.out.println("Exclusão realizada.");
						break;
					case 5:
						System.out.println("Finalizado o programa…");
						break;
					default:
						
						System.out.println("Opção inválida! Tente novamente.");
						break;
				}
			}
			
			sc.close();
		}
}
