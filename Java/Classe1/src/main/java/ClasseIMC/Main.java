package ClasseIMC;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.print("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        objetoPessoa.getPeso();
        objetoPessoa.getAltura();
        System.out.print("IMC: " + objetoPessoa.calcularIMC());

    }

}
