package Aula1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.print(" Anos: " );
    final int anos;
        anos = a.nextInt();
        System.out.print(" Meses: " );

    final int mes;
        mes = a.nextInt();
        System.out.print(" Dias: " );
        final int dias;
        dias = a.nextInt();


                    int ied;
                    int x;
                    int y;
                    int z;
    x = dias*1;
    y = mes*30;
    z = anos*365;
    ied  = x+y+z;

    System.out.println(" Idade em Dias: " + ied);

    }

}
