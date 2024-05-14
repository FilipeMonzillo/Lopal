package Aula3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva um numero :");
        float valor1;
        valor1 = s.nextInt();
        if (valor1 > 10)
        {
            System.out.println("Esse número é maior que 10");
        }
        else
        System.out.println("Este número não é maior que 10");
    }


}



