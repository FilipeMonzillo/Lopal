package Aula5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva a sua idade:");
        int idade;
        idade = s.nextInt();
            if (idade >= 5 && idade <= 7){
                System.out.println("Categoria Infantil A");
        }

            if (idade >= 8 && idade <= 10){
                System.out.println("Categoria Infantil B");
        }

            if (idade >= 11 && idade <= 13){
                System.out.println("Categoria Juvenil A");
        }

            if (idade >= 14 && idade <= 17){
                System.out.println("Categoria Juvenil B");
        }
            else if (idade >= 18){
            System.out.println("Categoria Adulto");
        }
    }

}