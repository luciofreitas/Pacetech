algoritmo "MissaoSemana4"


var
tempCel, tempFah, mReal, mDolar, mConversao: real
opcaoMenu, opcaoMenu2, opcaoMenu3: literal

inicio
escreval("1 - Converter Temperatura para Celsius")
escreval("2 - Converter Temperatura para Fahrenheit")
escreval("3 - Converter Real para Dolar")
escreval("4 - Converter Dola para Real")
escreval("5 - Sair")
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
   escreval("Informe o valor da moeda em reais desejado para que seja convertido em dolar: ")
   leia(mReal)
   escreval("Informe o valor da cotação: ")
   leia(mConversao)
   mReal <- mReal / mConversao
   escreval("O valor em dolar é: ", mReal:1:2)
caso = "4"
   escreval("Informe o valor da moeda em dolar desejado para que seja convertido em real: ")
   leia(mDolar)
   escreval("Informe o valor da cotação: ")
   leia(mConversao)
   mDolar <- mDolar * mConversao
   escreval("O valor em real é: ",mDolar:1:2)
fimescolha
fimalgoritmo
