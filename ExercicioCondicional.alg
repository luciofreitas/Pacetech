algoritmo "Exercicios de Condicionais"
// Função :
// Autor :
// Data : 17/05/2022
// Seção de Declarações
var
velocidadeVeiculo, velocidadeLeve, velocidadeMedia, velocidadeGrave,velocidadeGravissima: real
inicio

velocidadeLeve <- 50 * 1.1
velocidadeMedia <- 70
velocidadeGrave <- 90
velocidadeGravissima <- 100

Escreval ("Informe a velocidade que o veiculo passou: ")
leia(velocidadeVeiculo)

se velocidadeVeiculo <= velocidadeLeve entao
   Escreval ("Não vai receber multa")
senao
   se velocidadeVeiculo <= velocidadeMedia entao
      Escreval ("Receberá multa leve")
   senao
      se velocidadeVeiculo <= velocidadeGrave entao
         Escreval ("Receberá multa media")
         se velocidadeVeiculo <= velocidadeGravissima entao
            Escreval ("Receberá multa grave")
         senao
            Escreval ("Receberá multa gravissima")
         fimse
      fimse
   fimse
fimse
fimalgoritmo
