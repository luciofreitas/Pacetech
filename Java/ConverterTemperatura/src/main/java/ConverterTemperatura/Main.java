package ConverterTemperatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char menu = 'S';
        int opcao;
        float temperatura, celsius, fahrenheit;
        while (menu == 'S' || menu == 's') {
            System.out.println("Digite 1 para converter Celsius para Fahrenheit");
            System.out.println("Digite 2 para converter de Fahrenheit para Celsius");
            System.out.println("Digite 3 para imprimir as 100 primeiras temperaturas"
                    + " de Celsius para Faherenheit");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Por favor informe a temperatura em ºC: ");
                    celsius = leitor.nextFloat();
                    fahrenheit = (celsius * (9 / 5)) + 32;
                    System.out.println(fahrenheit);

                    break;
                case 2:
                    System.out.println("Por favor informe a temperatura em ºF: ");
                    fahrenheit = leitor.nextFloat();
                    celsius = (fahrenheit - 32) / (9 / 5);
                    System.out.println(celsius);
                    break;
                case 3:
                    for (int i = 0; i <= 100; i++) {
                        fahrenheit = (i * (9 / 5)) + 32;
                        System.out.println(i + "ºC equivale a " + fahrenheit + "ºF");

                    }
                    break;
                default:

                    break;
            }
            System.out.println("Deseja continuar? S ou N");
            menu = leitor.next().charAt(0);
        }
    }

}