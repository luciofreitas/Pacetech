algoritmo "semnome"
// Função :
// Autor :
// Data : 24/05/2022
// Seção de Declarações
var
tempCel, tempFah, mReal, mDolar, mConversao: real
opcaoMenu, opcaoMenu2, opcaoMenu3: literal
i: inteiro

inicio
repita
   escreval("1 - Converter Temperatura para Celsius")
   escreval("2 - Converter Temperatura para Fahrenheit")
   escreval("3 - Converter os 100 primeiros numeros de Celsius para Fahrenheit")
   escreval("4 - Sair")
   leia(opcaoMenu)
   limpatela
   escolha opcaoMenu
   caso = "1"
      escreval("Escreva a temperatura em Fahrenheit que voce deseja converter para Celsius: ")
      leia(tempFah)
      tempCel <- (tempFah-32)/1.8
      limpatela
      escreval("A temperatura em Celsius é: ",tempCel:1:2)
      repita
         escreval("")
         escreval("")
         escreval("")
         escreval("1 - Para realizar outro tipo de conversao de temperatura")
         escreval("2 - Sair")
         leia(opcaoMenu2)
         limpatela
         escolha opcaoMenu2
         caso = "1"
            escreval("1 - Converter Temperatura para Celsius")
            escreval("2 - Converter Temperatura para Fahrenheit")
            leia(opcaoMenu3)
            escolha opcaoMenu3
            caso = "1"
               escreval("Escreva a temperatura em Fahrenheit que voce deseja converter para Celsius: ")
               leia(tempFah)
               tempCel <- (tempFah-32)/1.8
               limpatela
               escreval("A temperatura em Celsius é: ",tempCel:1:2)
            caso = "2"
               escreval("Escreva a temperatura em Celsius que voce deseja converter para Fahrenheit: ")
               leia(tempCel)
               tempFah <- (tempCel+32)* 1.8
               escreval("A temperatura em Fahrenheit é: ",tempFah:1:2)
            fimescolha
         fimescolha
      ate opcaoMenu2 = "2"
   caso = "2"
      escreval("Escreva a temperatura em Celsius que voce deseja converter para Fahrenheit: ")
      leia(tempCel)
      tempFah <- (tempCel+32)* 1.8
      limpatela
      escreval("A temperatura em Fahrenheit é: ",tempFah:1:2)

      repita
         escreval("")
         escreval("")
         escreval("")
         escreval("1 - Para realizar outro tipo de conversao de temperatura")
         escreval("2 - Sair")
         leia(opcaoMenu2)
         limpatela
         escolha opcaoMenu2
         caso = "1"
            escreval("1 - Converter Temperatura para Celsius")
            escreval("2 - Converter Temperatura para Fahrenheit")
            leia(opcaoMenu3)
            limpatela
            escolha opcaoMenu3
               limpatela
            caso = "1"
               escreval("Escreva a temperatura em Fahrenheit que voce deseja converter para Celsius: ")
               leia(tempFah)
               tempCel <- (tempFah-32)/1.8
               limpatela
               escreval("A temperatura em Celsius é: ",tempCel:1:2)
            caso = "2"
               escreval("Escreva a temperatura em Celsius que voce deseja converter para Fahrenheit: ")
               leia(tempCel)
               tempFah <- (tempCel+32)* 1.8
               escreval("A temperatura em Fahrenheit é: ",tempFah:1:2)
            fimescolha
         fimescolha
      ate opcaoMenu2 = "2"
   caso = "3"
      para i de 1 ate 100 faca
         tempFah <- i * 1.8 + 32
         escreval(i,"ºC equivale a ", tempFah:1:2,"ºF")
      fimpara
      escreval("")
      escreval("")
      escreval("")
   fimescolha
ate opcaoMenu = "4"
fimalgoritmo
