algoritmo "DesafioSemana5"



var

opcao: literal
i,j:inteiro
vC,vF,conversao: vetor[1..4] de real
vH: vetor[1..4] de inteiro
auxHora: inteiro
auxTemp, auxConversao: real


//---------------------------

procedimento CparaF

inicio


      para i de 1 ate 4 faca

         Escreval("Informe a temperatura em Celsius")
         leia(vC[i])

         conversao[i] <- (vC[i]*1.8)+32

         limpatela

         Escreval("Informe a hora da temperatura informada anteriormente")
         leia(vH[i])

         limpatela


         para j de 1 ate 4 faca
            se vC[j] > vC[i] entao
               auxTemp <- vC[i]
               auxHora <- vH[i]
               auxConversao <- conversao[i]
               vC[i] <- vC[j]
               vH[i] <- vH[j]
               conversao[i] <- conversao[j]
               vC[j] <- auxTemp
               vH[j] <- auxHora
               conversao[j] <- auxConversao
            fimse
         fimpara
      fimpara

      para i de 1 ate 4 faca

      Escreval ("A temperatura em Celsius é: ",vC[i],"ºC, registrada as ", vH[i], ":00 Horas, correspondem a ", conversao[i],"F")
      fimpara

   fimescolha


fimprocedimento

//---------------------------

inicio

repita

   Escreval("Qual conversão você deseja fazer?")
   Escreval("")
   Escreval("1 - Conversão de fahrenheit para Celsius")
   Escreval("2 - Conversão de Celsius para fahrenheit")
   Escreval("3 - sair")
   leia(opcao)


   escolha opcao

   caso "1"

   CparaF

  fimescolha

ate opcao = "3"

fimalgoritmo
