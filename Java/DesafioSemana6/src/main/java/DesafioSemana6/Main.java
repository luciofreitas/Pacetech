package DesafioSemana6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float tempCelsius = 0f, tempFahrenheit = 0f, cCelsius = 0f, cFahrenheit = 0f;
        float mReal = 0f, mDolar = 0f, mCotacao = 0f;
        int menu = 0, menu2 = 0, menu3 = 0;

        do {
            System.out.println("Bem-vindo ao Menu, o que deseja fazer?");
            System.out.println("");
            System.out.println("1 - Convercao de Temperaturas");
            System.out.println("2 - Convercao de Moedas");
            System.out.println("3 - Sair");
            System.out.println("");
            menu = leitor.nextInt();
            switch (menu) {
                case 1 -> {
                    do {
                        System.out.println("1 - Converter Celsius para Fahrenheit");
                        System.out.println("2 - Converter Fahrenheit para Celsius");
                        System.out.println("3 - Voltar ao menu anterior");
                        menu2 = leitor.nextInt();
                        switch (menu2) {
                            case 1 -> {
                                System.out.print("Por favor, informe o valor em Celsius"
                                        + " que deseja converter: ");
                                tempCelsius = leitor.nextFloat();
                                cFahrenheit = (tempCelsius * (9 / 5)) + 32;
                                System.out.println("A temperatura em Celsius " + tempCelsius
                                        + " ºC convertida em Fahrenheit é: " + String.format("%.2f", cFahrenheit) + " ºF");
                            }

                            case 2 -> {
                                System.out.print("Por favor, informe o valor em Fahrenheit"
                                        + " que deseja converter: ");
                                tempFahrenheit = leitor.nextFloat();
                                cCelsius = (tempFahrenheit - 32) / (9 / 5);
                                System.out.println("A temperatura em Fahrenheit " + tempFahrenheit
                                        + " ºF convertida em Celsius eh: " + String.format("%.2f", cCelsius) + " ºC");
                            }
                            case 3 -> {
                            }

                            default ->
                                System.out.println("Opcao Invalida");
                        }
                    } while (menu2 != 3);
                }
                case 2 -> {
                    do {
                        System.out.println("1 - Converter Dolar para Real");
                        System.out.println("2 - Converter Real para Dolar");
                        System.out.println("3 - Voltar ao menu anterior");
                        menu3 = leitor.nextInt();
                        switch (menu3) {
                            case 1 -> {
                                System.out.print("Por favor, informe o valor da cotacao "
                                        + " desejada: ");
                                mCotacao = leitor.nextFloat();

                                System.out.print("Por favor, informe o valor em real "
                                        + "que deseja para que seja convertido em dolar: ");
                                mReal = leitor.nextFloat();
                                mDolar = mReal / mCotacao;
                                System.out.println("O valor em dolar eh: $ " + String.format("%.2f", mDolar));
                            }

                            case 2 -> {
                                System.out.print("Por favor, informe o valor da cotacao "
                                        + " desejada: ");
                                mCotacao = leitor.nextFloat();
                                System.out.print("Por favor, informe o valor em dolar "
                                        + "que deseja para que seja convertido em real: ");
                                mDolar = leitor.nextFloat();

                                mReal = mDolar * mCotacao;
                                System.out.println("O valor em real eh R$: " + String.format("%.2f", mReal));
                            }
                            case 3 -> {
                            }

                            default ->
                                System.out.println("Opcao Invalida");
                        }
                    } while (menu3 != 3);
                }
                case 3 -> {
                }

                default ->
                    System.out.println("Opcao Invalida");

            }
        } while (menu != 3);

    }

}
