package Heranca;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
       Vendedor v = new Vendedor();
       v.setNome("Lucio");
       v.setSalario(1000.0f);
       v.setCpf("10245452702");
       v.setDtNascimento(new Date());
       v.setComissaoPorItem(10.0f);
       v.setTotalItensVendidos(10);
       
       System.out.println("O salario do vendedor é: "+v.calcularSalario());
       
       Motorista m = new Motorista();
       
    }
    
}
