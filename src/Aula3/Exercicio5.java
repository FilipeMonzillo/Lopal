package Aula3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = s.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Esse numero é par");
        }
        else
            System.out.println("Esse número é impar");


    }
}
