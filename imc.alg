algoritmo "IMC"
// Função :
// Autor :
// Data : 20/05/2022
// Seção de Declarações
var
altura, peso, imc: real

inicio

escreval ("Informe sua altura: ")
leia(altura)
escreval ("Informe seu peso: ")
leia(peso)
imc <- peso / altura ^ 2
escreval("Seu imc é: ",imc)

se imc < 18.5 entao
   escreval("Voce está abaixo do peso")
senao
   se (imc >= 18.5) e (imc <= 24.9) entao
      escreval ("Voce está com o peso normal")
   senao
      se (imc >= 25) e (imc <= 29.9) entao
         escreval ("Voce está com sobrepeso")
      senao
         se (imc >= 30) e (imc <= 34.9) entao
            escreval ("Voce está com obesidade grau I")
         senao
            se (imc >= 35) e (imc <= 39.9) entao
               escreval ("Voce está com obesidade grau II")
            senao
               se imc >= 40 entao
                  escreval ("Voce está com obesidade grau III ou mórbida")
               fimse
            fimse
         fimse
      fimse
   fimse
fimse

fimalgoritmo
