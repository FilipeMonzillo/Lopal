package Aula7;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      int[][] tabela = new int[4][2];
        int qtdNumeros = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Quantos números deseja ler? ");
        qtdNumeros = s.nextInt();
        float[] medias = new float[qtdNumeros];

        for (int aluno = 0; aluno <qtdNumeros; aluno++) {
            System.out.print("Informe o valor: ");
            medias[aluno] = s.nextFloat();
        }
//        Escrever os valores lidos
        System.out.println("Os valores lidos foram: ");
        for (int posicao = 0; posicao<qtdNumeros; posicao++) {
            System.out.println(medias[posicao]);
        }

    }
}
