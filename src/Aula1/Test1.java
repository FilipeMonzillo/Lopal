package Aula1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        //Comentário de linha

        /*Comentário de Bloco
                    Bloco
                    Bloco */

        float valor;    //Variável
        final float PI; //Constante
        valor = 2.5F;
        valor = 5;
        PI = 5;
        System.out.println(valor);
        System.out.println(PI);

        String nome;
        Scanner s = new Scanner(System.in);
        nome = s.nextLine();
        System.out.println(nome);
    }
}
