package m2atividadeEmSala01;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota=0, soma=0,media=0 ;
        int contador=0;
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;

        do { 
            System.out.println("Avalie nosso serviço, de 1 até 5, digite 0 se não deseja participar");
            nota = sc.nextInt();
            
            if (nota >=1 && nota <=5) {
                contador++;
                soma += nota;
                if (nota == 1) {
                cont1++;
                } else if (nota == 2) {
                cont2++;
                } else if (nota == 3) {
                cont3++;
                } else if (nota == 4) {
                cont4++;
                } else if (nota == 5) {
                cont5++;
                } 
            }else 
            System.out.println("Digite uma nota valída (Entre 1 e 5)");
        } while (nota != 0); {
        
        	media= soma/contador;
    
        System.out.println("Quantidade de respostas registradas foi: "+contador);
        System.out.println("Média das notas foi: "+media);
        System.out.println("Nota 1 foi digitada "+cont1+ "x" );
        System.out.println("Nota 2 foi digitada "+cont2+ "x" );
        System.out.println("Nota 3 foi digitada "+cont3+ "x" );
        System.out.println("Nota 4 foi digitada "+cont4+ "x" );
        System.out.println("Nota 5 foi digitada "+cont5+ "x" );
    }
    sc.close();
}
}
