package Aulas;

import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        String nomeCliente;

        System.out.println("Digite o nome do Cliente ");
        nomeCliente = dados.nextLine();

        System.out.println("Seu nome é: " + nomeCliente);

        dados.close();
    }
}
