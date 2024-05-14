package Aula3;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Escreva um número:");
        a = s.nextInt();
        int b;
        System.out.print("Escreva outro número:");
        b = s.nextInt();
        System.out.println("Qual das operações matemáticas desaja aplicar? \n+ Soma (+)" + "\n Subtração (-)" + "\nDivisão (/)" + "\nMultiplicação(*) ");
        String operacao;
        int resultado;
        operacao = s.nextLine();
        switch (operacao)
        {
            case "+":
                System.out.println("A soma é: " + (a + b));
                break;
            case "-":
                System.out.println("A subtração é: " + (a - b));
                break;
            case "/":
                System.out.println("A divisão é: " + (a / b));
                break;
            case "*":
                System.out.println("A multiplicação é: " +(a * b));
                break;
        }










    }
}
