package Aula6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Digite um número para ler sua tabuada: ");
        num = s.nextInt();


        for (int vezes = 1; vezes <= 10; vezes ++){
            int tabuada = num*vezes;
            System.out.println(num+"x" + vezes + "=" + tabuada);

        }

    }
}
