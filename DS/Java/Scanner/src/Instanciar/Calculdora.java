import java.util.Scanner;

public class Calculdora {

    Scanner calc = new Scanner(System.in);

    String nome;
    double altura;

    double a;
    double b;
    double res;

    void dados() {

        System.out.println("Digite o seu nome: ");
        nome = calc.nextLine();
        System.out.println("Digite a sua altura: ");
        altura = calc.nextDouble();

        // nome = "Gabriel";
        // altura = 1.74;

        System.out.println("Seu nome é: " + nome + " Sua altura é: " + altura);
    }

    void somar() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a + b;
        System.out.println("O valor da soma é: " + res);

    }

    void subtrair() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a - b;
        System.out.println("O valor da subtração é: " + res);

    }

    void multiplicar() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a * b;
        System.out.println("O valor da multiplicação é: " + res);

    }

    void dividir() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a / b;
        System.out.println("O valor da divisão é: " + res);

    }

    void areaQuadrado() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a * a;
        System.out.println("O valor da area do quadrado é: " + res);

    }

    void areaTriangulo() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = (a * b) / 2;
        System.out.println("O valor da area do triangulo é: " + res);

    }

    void areaRetangulo() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a * b;
        System.out.println("O valor da area do retangulo é: " + res);

    }

    void volumeCone() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = (3.14 * a * b) / 3;
        System.out.println("O volume do cone é: " + res);

    }

    void volumeCubo() {

        System.out.println("Digite o item A: ");
        a = calc.nextDouble();

        System.out.println("Digite o item B:");
        b = calc.nextDouble();

        // double a = 10;
        // double b = 10;
        // double res = a + b;

        double res = a * a * a;
        System.out.println("O volume do cubo é: " + res);

    }
}
