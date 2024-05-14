package Aula1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.print(" Salário: " );
        int salario = a.nextInt();
        System.out.print(" Percentual do Reajuste: " );
        int percentual = a.nextInt();
        int resultado;
        int NS;

    resultado = salario /100 * percentual;
    NS = salario + resultado;

        System.out.println(" Novo Salário: " + NS);
    }
}
