package Aula3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Vá até a porta");
        Scanner s = new Scanner(System.in);
        System.out.println("A porta está fechada?");
        boolean resp = s.nextBoolean();
        if (resp == true)
             System.out.println("Abra a porta");
        else
             System.out.println("pode seguir");
        System.out.println("Sai da sala");
    }



}
