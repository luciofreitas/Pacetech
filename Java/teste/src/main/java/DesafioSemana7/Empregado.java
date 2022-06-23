package DesafioSemana7;

public class Empregado {

    private String pNome;
    private String sNome;
    private double salarioMensal;

    public Empregado(String pNome, String sNome, double salarioMensal) {
        this.setpNome(pNome);
        this.setsNome(sNome);
        this.setSalarioMensal(salarioMensal);
    }

    public double CalcularAumento() {
        return (salarioMensal * 1.1);
    }

    public double SalarioAnual() {
        return (salarioMensal * 12);
    }
    
    public double SalarioAnualAumento(){
        return (SalarioAnual()*1.1);
    }

    public String getpNome() {
        return pNome;
    }

    public void setpNome(String pNome) {
        this.pNome = pNome;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0.0f;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

}
