package Aula1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    int a,b;
    System.out.print("Informe o valor de A: ");
    a = s.nextInt();
    System.out.print("Informe o valor de B: ");
    b = s.nextInt();
    int aux = a;
    a = b;
    b = a;
    a = aux;
     System.out.println(" O valor de A é: "+ b );
     System.out.println(" O valor de B é: "+ a );




    }
}
