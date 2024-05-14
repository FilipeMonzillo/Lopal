package Aula6;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int result;
        String vezes = "sim";
        while(vezes.equals("sim")) {
            System.out.println("Escreva o 1° número:");
            num1 = s.nextInt();
            System.out.println("Escreva o 2° número:");
            num2 = s.nextInt();
            System.out.println("Escreva o 3° número:");
            num3 = s.nextInt();
            System.out.println("Escreva o 4° número:");
            num4 = s.nextInt();
            System.out.println("Escreva o 5° número:");
            num5 = s.nextInt();
            result = num1 + num2 + num3 + num4 + num5;
            System.out.println("A soma dos números é:" + result);
            System.out.println("Quer escrever novamente?");
            s.nextLine();
            vezes = s.nextLine();

        }
    }
}





