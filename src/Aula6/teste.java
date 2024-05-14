package Aula6;

import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

//        Faz quanto eu falar para fazer

       // for (int vezes = 1; vezes <= 10; vezes += 1)//(vezes+=1) é a abreviação de (vezes = vezes + 1)
      //for (int vezes = 1; vezes <= 10; vezes -= 1)  (vezes-=1) é a abreviação de (vezes = vezes - 1)
      //for (int vezes = 1; vezes <= 10; vezes -= 1)  (vezes++) é a abreviação de (vezes = vezes + 1)
      //for (int vezes = 1; vezes <= 10; vezes -= 1)  (vezes--) é a abreviação de (vezes = vezes - 1)
       // {
            //System.out.println("Olá");
       // }
//
//        Faz enquanto for verdade

//        String vezes = "sim";
        Scanner s = new Scanner(System.in);
//        while(vezes.equals("sim"))
//        {
//            System.out.println("Oláááá");
//            System.out.println("Quer escrever novamente?");
//            vezes=s.nextLine();
//        }
//       Pelo menos uma vez o DoWhile vai fazer
//
//        do{
//            System.out.println("Oláááá");
//            System.out.println("Quer escrever novamente?");
//            vezes=s.nextLine();
//        }while (vezes.equals("sim"));


        Random r = new Random();
        for (int v = 1; v<=5; v++)
        System.out.println(r.nextInt(3)+1);
    }

}