package Aula4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n1 = s.nextInt();
        System.out.print("Digite outro número: ");
        n2 = s.nextInt();
        if (n1 > n2) {
            System.out.println("O 1° número é o maior");
        } else if (n1 == n2) {
            System.out.println("Os números são iguais");
        } else if (n1 < n2) {
            System.out.println("O 2° número é o maior");
        }
    }
}
