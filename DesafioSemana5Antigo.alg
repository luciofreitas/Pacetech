algoritmo "Desafio Semana 5"
// Função :
// Autor :
// Data : 02/06/2022
// Seção de Declarações
var
vCelsius, vFahrenheit: vetor[1..2] de real
vHora: vetor[1..2] de inteiro
opcaoMenu: literal

procedimento exibirMenu()

inicio
escreval("Qual conversão você deseja realizar?")
escreval("1 - Converter temperatura para Celsius")
escreval("2 - Converter temperatura para Fahrenheit")
escreval("3 - Sair")
leia(opcaoMenu)

fimprocedimento

funcao convertFahrenheitToCelsius(vFahrenheit:real):real
var
i, j, auxHora: inteiro
auxTemp: real
inicio
para i de 1 ate 2 faca
   escreval("Escreva em Fahrenheit a temperatura que voce deseja converter para Celius: ")
   leia(vFahrenheit[i])
   retorne (vFahrenheit[i]-32)/1.8
   limpatela
   escreval("Informe a hora da temperatura informada anteriormente: ")
   leia(vHora[i])
   limpatela
   para j de 1 ate 2 faca
      se vFahrenheit[j] > vFahrenheit[i] entao
         auxTemp <- vFahrenheit[i]
         auxHora <- vHora[i]
         vFahrenheit[i] <- vFahrenheit[j]
         vHora[i] <- vHora[j]
         vFahrenheit[j] <- auxTemp
         vHora[j] <- auxHora
      fimse
   fimpara
fimpara
fimfuncao
funcao celsiusToFahrenheit(vCelsius:real):real
inicio
escreval ("Escreva em Celsius a temperatura que você deseja converter para Fahrenheit: ")
leia(vCelsius)
vFahrenheit <- (vCelsius+32)*1.8
escreval ("Por favor, informe a hora da temperatura informada anteriormente: ")
leia(vHora)
escreval("A temperatura em Fahrenheit é: ", vFahrenheit:1:2)
fimfuncao

inicio
repita
   exibirMenu()
   limpatela
   escolha opcaoMenu
   caso = "1"
      para i de 1 ate 2 faca
         escreval("A temperatura em Celsius é: ",vCelsius[i],"ºC, registrada as ",vHora[i],"correspondem a ",fahrenheitToCelsius(vFahrenheit[i],"ºF"))
      fimpara
   caso = "2"
      celsiusToFahrenheit()
   caso = "3"
   outrocaso
      escreval ("Opção Invalida")
      escreval(" ")
      escreval(" ")
   fimescolha

ate opcaoMenu = "3"
fimalgoritmo
