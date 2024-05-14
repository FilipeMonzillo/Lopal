package Aula4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        System.out.print("Escreva o tamanho de um lado do triângulo:");
        ladoA= s.nextInt();
        System.out.print("Escreva o tamanho de outro lado do triângulo:");
        ladoB = s.nextInt();
        System.out.print("Escreva o tamanho do ultimo lado do triângulo:");
        ladoC = s.nextInt();
    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB)
        {
            if ( ladoA == ladoB && ladoA == ladoC ) {
                System.out.println("É um trianfulo Equilatero");}
            else {
                if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                    System.out.println("É um triangulo Isoceles");}
                else {
                    System.out.println("É um triangulo Escaleno");
                }
            }
        }






    }
}

