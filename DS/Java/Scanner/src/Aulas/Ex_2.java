package Aulas;

import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade ");
        idade = x.nextInt();

        System.out.println("Sua idade é: " + idade);

        x.close();
    }
}
