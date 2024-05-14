package Aula3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int years;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a idade:");
        years = s.nextInt();
        if (years >= 18){
            System.out.println("Essa pessoa é maior de idade");
        }
        else
            System.out.println("Essa pessoa é menor de idade");
    }

}
