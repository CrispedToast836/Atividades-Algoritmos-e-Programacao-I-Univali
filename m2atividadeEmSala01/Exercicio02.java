package m2atividadeEmSala01;

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero, contador=0, soma=0;
        double media;
        String numerosInformados = "";
        

        do {
            System.out.println("Informe um numéro inteiro: ");
            numero = sc.nextDouble();
            soma += numero;
            numerosInformados = numerosInformados +" "+numero;
            contador++;
        } while (soma<100 || contador<10);
        media= soma/contador;

        System.out.println("A quantidade de números informados é "+contador);
        System.out.println("Esses numeros foram: "+numerosInformados);
        System.out.println("A soma total dos números: "+soma);
        System.out.println("A média dos valores é: "+media);
        sc.close();
    }
}
