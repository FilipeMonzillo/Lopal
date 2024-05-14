package Aula1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.print(" 1ª Nota: " );
        float nota1 = a.nextInt();
        System.out.print(" 2ª Nota: " );
       float nota2 = a.nextInt();
        System.out.print(" 3ª Nota: " );
        float nota3 = a.nextInt();
        float resultado;

        resultado = (nota1+nota2+nota3)/3;
        System.out.println(" Média Final: " + resultado);






    }
}
