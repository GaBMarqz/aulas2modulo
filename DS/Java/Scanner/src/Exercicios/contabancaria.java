package Exercicios;

import java.util.Scanner;

public class contabancaria {

    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        String nomeCliente;
        String agencia;
        int contaConrrente;
        double saldo;

        System.out.println("Digite o seu nome: ");
        nomeCliente = cc.nextLine();
        System.out.println("Digite os dados da sua agência: ");
        agencia = cc.nextLine();
        System.out.println("Digite os dados da sua conta bancária: ");
        contaConrrente = cc.nextInt();
        System.out.println("Digite o seu saldo atual");
        saldo = cc.nextDouble();

        System.out.println("============ Dados do Clente ============");
        System.out.println("Sr(a): " + nomeCliente);
        System.out.println("Número da Agência Bancária: " + agencia);
        System.out.println("Número da Conta Corrente: " + contaConrrente);
        System.out.println("Valor do Saldo disponível atual é: " + saldo);

        cc.close();
    }
    
}
