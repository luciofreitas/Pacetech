package ClasseIMC;

public class Pessoa {

    //atributos
    private float peso, altura;

    //metodos
    
    public Pessoa(){
        System.out.println("Executando o metodo construtor");
    }
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    //metodos acessores
    public void setPeso(float peso) {

        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
