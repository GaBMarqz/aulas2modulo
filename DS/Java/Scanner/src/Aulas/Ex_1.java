package Aulas;

import javax.swing.JOptionPane;

public class Ex_1 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite a base: ");
        String input2 = JOptionPane.showInputDialog("Digite a altura: ");
        int base_triangulo = Integer.parseInt(input1);
        int altura_triangulo = Integer.parseInt(input2);

        int area_triangulo = (base_triangulo * altura_triangulo) / 2;
        JOptionPane.showMessageDialog(null, "A área do seu triangulo é: " + area_triangulo);

        String input3 = JOptionPane.showInputDialog("Digite a base: ");
        String input4 = JOptionPane.showInputDialog("Digite a altura: ");
        int base_retangulo = Integer.parseInt(input3);
        int altura_retangulo = Integer.parseInt(input4);

        int area_retangulo = (base_retangulo * altura_retangulo) / 2;
        JOptionPane.showMessageDialog(null, "A área do seu retangulo é: " + area_retangulo);

        String input5 = JOptionPane.showInputDialog("Digite o lado: ");
        int lado_quadrado = Integer.parseInt(input5);

        int area_quadrado = (lado_quadrado * lado_quadrado) / 2;
        JOptionPane.showMessageDialog(null, "A área do seu quadrado é: " + area_quadrado);

    }
}
