package Aula4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float nota1, nota2, nota3;
        int aulas, faltas, perA, faltA;
        System.out.print(" 1ª Nota: ");
        nota1 = s.nextFloat();
        System.out.print(" 2ª Nota: ");
        nota2 = s.nextFloat();
        System.out.print(" 3ª Nota: ");
        nota3 = s.nextFloat();
        System.out.println("Digite o número de aulas");
        aulas = s.nextInt();
        System.out.println("Digite o número de faltas que o aluno obteve");
        faltas = s.nextInt();

        float media = (nota1 + nota2 + nota3) / 3;
        if (media >= 5 && faltas < (float) 25 / 100 * aulas) {
            System.out.println("O aluno esta aprovado! Com média:" + media);
        } else if (media < 4 && faltas >= (float) 25 / 100 * aulas) {
            System.out.println("O aluno está reprovado! Com média:" + media);
        } else if (media >= 4 && media < 5 && faltas < (float) 25 / 100 * aulas) {
            System.out.println("O aluno deverá fazer a prova novamente");
        } else if (media >= 4 && media < 5 && faltas >= (float) 25 / 100 * aulas) {
            System.out.println("O aluno está reprovado!");



        }

    }
}