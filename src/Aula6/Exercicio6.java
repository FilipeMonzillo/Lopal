package Aula6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao, somaDist=0, qtdPraias=0,qtd15km=0,qtd10km=0, dist=0, maisDist=0;
        String nomePraia, nomeMaisDist="", outraPraia;
        do {
            System.out.println("Menu: " + "\n1 - Ler Praias: " +
                    "\n2 - Mostrar Praias mais Distantes " +
                    "\n3 - Quantidade de Praias a mais de 10Km " +
                    "\n4 - Quantidade de Praias a mais de 15Km " +
                    "\n5 - Distância média das praias" +
                    "\n0 - Sair" +
                    "\n  - Escolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine();
            switch (opcao) {
                case 0:
                    System.out.println("Até Logo!");
                    break;
                case 1:
                    do {

                        System.out.println("Informe o nome da Praia");
                        nomePraia = s.nextLine();
                        System.out.println("Informe a distância dessa Praia");
                        dist = s.nextInt();
                        s.nextLine();
                        if (dist > maisDist) {
                            maisDist = dist;
                            nomeMaisDist = nomePraia;
                        }
                        if (dist >= 15) {
                            qtd15km++;
                        } else {
                            if (dist >= 10) {
                                qtd10km++;
                            }
                        }
                        somaDist += dist;
                        qtdPraias++;

                        System.out.println("Quer ler outra Praia?");
                        outraPraia = s.nextLine();
                    }
                    while (outraPraia.equals("sim"));
                    break;
                case 2:
                    System.out.println("A Praia mais distânte é: " + nomeMaisDist);
                    break;
                case 3:
                    System.out.println("Existem " +qtd10km + " Praias a mais de 10Km. ");
                    break;
                case 4:
                    System.out.println("Existem " +qtd15km + " Praias a mais de 15Km. ");
                    break;
                case 5:
                    System.out.println("A distância média das praias é: " + ((double)somaDist/qtdPraias));
                    break;

            }
        }while(opcao !=0);
    }

}

