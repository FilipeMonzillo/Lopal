package Aula4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o 1° número");
        n1 = s.nextInt();
        System.out.println("Digite o 2° número");
        n2 = s.nextInt();
        System.out.println("Digite o 3° número");
        n3 = s.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println("O 1° número é o maior");
        } else if (n2>n1 && n2>n3) {
            System.out.println("O 2° número é o maior");
        } else if (n1<n3 && n3>n2) {
            System.out.println("O 3° número é o maior");
        }
    }
}
