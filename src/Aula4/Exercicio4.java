package Aula4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int g1, g2;
        String n1, n2;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do 1° time: ");
        n1 = s.nextLine();
        System.out.print("Digite o nome do 2° time: ");
        n2 = s.nextLine();
        System.out.print("Digite o número de gols do 1° time: ");
        g1 = s.nextInt();
        System.out.print("Digite o número de gols do 2° time: ");
        g2 = s.nextInt();
        if (g1 > g2) {
            System.out.println("O 1° time é o Vencedor!");
        } else if (g1 == g2) {
            System.out.println("Houve um Empate, Nenhum dos times é o Vencedor.");
        } else if (g1 < g2) {
            System.out.println("O 2° time é o Vencedor!");
        }
    }
}
