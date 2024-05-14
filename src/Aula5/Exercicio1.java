package Aula5;

import java.util.Scanner;

public class Exercicio1 {

    static void calculoDaArea()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o tamanho do raio:");
        double raio;
        raio = s.nextDouble();
        double area;;
        double pi;
        pi = 3.14;
        area = pi * raio * raio;
        System.out.println("A área é:" + area);
    }
    public static void main(String[] args) {
calculoDaArea();

    }
}
