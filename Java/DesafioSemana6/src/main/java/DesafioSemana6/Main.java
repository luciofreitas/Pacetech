package DesafioSemana6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float tempCelsius = 0f, tempFahrenheit = 0f, cCelsius = 0f, cFahrenheit = 0f;
        float mReal = 0f, mDolar = 0f, mCotacao=0f;
        int menu = 0;

        do {
            System.out.println("Bem-vindo ao Menu, o que deseja fazer?");
            System.out.println("");
            System.out.println("");
            System.out.println("1 - Converter Celsius para Fahrenheit");
            System.out.println("2 - Converter Fahrenheit para Celsius");
            System.out.println("3 - Converter Dolar para Real");
            System.out.println("4 - Converter Real para Dolar");
            System.out.println("5 - Sair");
            menu = leitor.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("Por favor, informe o valor em Celsius"
                            + " que deseja converter: ");
                    tempCelsius = leitor.nextFloat();
                    cFahrenheit = (tempCelsius * (9 / 5)) + 32;
                    System.out.println("A temperatura em Celsius " + tempCelsius
                            + " �C convertida em Fahrenheit �: " + cFahrenheit + " �F");
                }

                case 2 -> {
                    System.out.print("Por favor, informe o valor em Fahrenheit"
                            + " que deseja converter: ");
                    tempFahrenheit = leitor.nextFloat();
                    cCelsius = (tempFahrenheit - 32) / (9 / 5);
                    System.out.println("A temperatura em Fahrenheit " + tempFahrenheit
                            + " �F convertida em Celsius eh: " + cCelsius + " �C");
                }

                case 3 -> {
                    System.out.print("Por favor, informe o valor da cotacao "
                            + " desejada: ");
                    mCotacao = leitor.nextFloat();

                    System.out.print("Por favor, informe o valor em real "
                            + "que deseja para que seja convertido em dolar: ");
                    mReal = leitor.nextFloat();
                    mDolar = mReal / mCotacao;
                    System.out.println("O valor em dolar eh: $ " + mDolar);
                }

                case 4 -> {
                    System.out.print("Por favor, informe o valor da cotacao "
                            + " desejada: ");
                    mCotacao = leitor.nextFloat();
                    System.out.print("Por favor, informe o valor em dolar "
                            + "que deseja para que seja convertido em real: ");
                    mDolar = leitor.nextFloat();

                    mReal = mDolar * mCotacao;
                    System.out.println("O valor em real eh R$: " + mReal);
                }

                case 5 -> {
                }

                default ->
                    System.out.println("Opcao Invalida");

            }
        } while (menu != 5);

    }

}
