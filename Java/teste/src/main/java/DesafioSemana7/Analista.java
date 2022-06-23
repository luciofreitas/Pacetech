
package DesafioSemana7;

public class Analista extends Empregado {
    
    private double salarioAnual;
    private double aumento=0.1f;
    
    public Analista(String pNome, String sNome, double salarioMensal) {
        super(pNome, sNome, salarioMensal);
    }
    
}
