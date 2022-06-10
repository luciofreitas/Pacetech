package exercicioEstruturaRepeticaoFor;
//Exercicio22

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        for (; i < 40; i++) {
            System.out.print("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();
            System.out.print("Digite o preco de custo do produto: ");
            precoCusto = leitor.nextFloat();
            System.out.print("Digite o preco de venda do produto: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.print("Houve um empate entre o preco de custo e o preco de venda");

            } else {
                if (precoCusto > precoVenda) {
                    System.out.print("Houve prejuizo");

                } else {
                    System.out.print("Houve lucro");
                }
            }

        }
        System.out.print("O media do preco de custo é de: "+(totalCusto/i));
        System.out.print("O media de venda de custo é de: "+(totalCusto/i));
    }

}
