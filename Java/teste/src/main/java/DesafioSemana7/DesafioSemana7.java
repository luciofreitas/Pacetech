package DesafioSemana7;

public class DesafioSemana7 {

    public static void main(String[] args) {

        Empregado emp = new Empregado("Lucio", "de Freitas Pereira", 3000.00);

        System.out.println("Primeiro Nome: " + emp.getpNome());
        System.out.println("Sobrenome: " + emp.getsNome());
        System.out.println("Salario mensal: " + emp.getSalarioMensal());
        System.out.println("Salario Anual: " + emp.SalarioAnual());
        System.out.println("Salario com aumento de 10%: " + String.format("%.2f", emp.CalcularAumento()));
        System.out.println("Salario anual com aumento de 10%: " + String.format("%.2f", emp.SalarioAnualAumento()));
    }

}
