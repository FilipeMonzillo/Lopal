package Aula6;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor;
        int qtdIntervalo;
        int qtdfIntervalo;
        qtdIntervalo=0;
        qtdfIntervalo=0;
        for (int vezes=1;vezes<=10;vezes++) {
            System.out.println("Informe o valor " + vezes + ":");
            valor = s.nextInt();
            s.nextLine();
            if (valor >= 10 && valor <= 20) {
                qtdIntervalo++;
            } else {
                qtdfIntervalo++;
            }
        }
        System.out.println("Temos " + qtdIntervalo + " entre 10 e 20.");
        System.out.println("Temos " + qtdfIntervalo + " fora do intervalo de 10 e 20.");
    }
}
