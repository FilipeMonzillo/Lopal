package Aula6;

import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float media, smedias;
        smedias=0;
        int qtdAlunos;
            System.out.println("Informe quantos alunos tem na turma. ");
            qtdAlunos = s.nextInt();
            for (int aluno = 1; aluno <=qtdAlunos; aluno++)
            {
                System.out.println("Informe a média do aluno:" + aluno + ": ");
                media = s.nextFloat();
                smedias+= media;
            }
        System.out.println("A media da turma é: " + smedias/qtdAlunos);

    }
}
