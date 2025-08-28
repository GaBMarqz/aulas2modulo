package Exercicios;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        String nome;

        System.out.println("Sigite o seu nome: ");
        nome = cc.nextLine();

        System.out.println("O seu nome é: " + nome);

        cc.close();
    }
    
}
