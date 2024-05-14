package Aula3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Escreva um número");
        Scanner s = new Scanner(System.in);
        float valor1;
        valor1 = s.nextInt();
        if (valor1 > -1) {
            System.out.println("Este número é positivo");
        }
        else
            System.out.println("Este número é negativo");

    }

}





