package Instanciar;

import java.util.Scanner;

public class Calculdadora {

    Scanner calc = new Scanner(System.in);
    
    String nome;
    double altura;

    double a;
    double b;
    double res;

    void dados(){

        System.out.println("Digite o seu nome: ");
        nome = calc.nextLine();
        System.out.println("Digite a sua altura: ");
        altura = calc.nextDouble();       

        //nome = "Gabriel";
        //altura = 1.74;

        System.out.println("Seu nome é: " + nome + 
                                "Sua altura é: " + altura);
    }
    
    void somar(){

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

         //double a = 10;
         //double b = 10;
         //double res = a + b;

         double res = a + b;
         System.out.println("O valor da soma é: " + res);

}
void subtrair(){

    System.out.println("Digite o item A: ");
    a = calc.nextDouble();

    System.out.println("Digite o item B:");
    b = calc.nextDouble();

     //double a = 10;
     //double b = 10;
     //double res = a + b;

     double res = a - b;
     System.out.println("O valor da soma é: " + res);

}

void multiplicar(){

    System.out.println("Digite o item A: ");
    a = calc.nextDouble();

    System.out.println("Digite o item B:");
    b = calc.nextDouble();

     //double a = 10;
     //double b = 10;
     //double res = a + b;

     double res = a * b;
     System.out.println("O valor da soma é: " + res);

}

void dividir(){

    System.out.println("Digite o item A: ");
    a = calc.nextDouble();

    System.out.println("Digite o item B:");
    b = calc.nextDouble();

     //double a = 10;
     //double b = 10;
     //double res = a + b;

     double res = a / b;
     System.out.println("O valor da soma é: " + res);

}
}
