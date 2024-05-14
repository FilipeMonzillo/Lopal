package Aula3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.print(" 1ª Nota: " );
        float nota1 = a.nextInt();
        System.out.print(" 2ª Nota: " );
        float nota2 = a.nextInt();
        System.out.print(" 3ª Nota: " );
        float nota3 = a.nextInt();
        float media = (nota1+nota2+nota3)/3;
        if (media>7) {
            System.out.println("O aluno esta aprovado! Com média:" + media);
        }
        else
            System.out.println("O aluno está reprovado! Com média:" + media);
    }
}
