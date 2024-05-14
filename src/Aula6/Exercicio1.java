package Aula6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        String vezes = "sim";
        Scanner s = new Scanner(System.in);

        while(vezes.equals("sim")) {
        float num1;
        System.out.println("Escreva o 1° número:");
        num1 = s.nextFloat();
        float num2;
        System.out.println("Escreva o 2° número:");
        num2 = s.nextFloat();
        if (num1 == 0 || num2 == 0) {
            System.out.println("Esta operação não pode ser concluída");
            break;
        }
        if (num1 != 0 && num2 != 0) {
            float resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);
            System.out.println("Quer escrever novamente?");
            s.nextLine();
            vezes=s.nextLine();
        }
        }
    }
}
