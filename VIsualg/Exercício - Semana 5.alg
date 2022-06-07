algoritmo "semnome"

var
vetorNumero : vetor[1..6] de inteiro
i,j,aux: inteiro
inicio
para i de 1 ate 6 faca
   escreval("Digite o nº ", i)
   leia(vetorNumero[i])
fimpara
limpatela
para i de 1 ate 6 faca
   para j de 1 ate 6 faca
      se vetorNumero[j] < vetorNumero[i] entao
         aux <- vetorNumero[i]
         vetorNumero[i]<- vetorNumero[j]
         vetorNumero[j]<- aux
      fimse
      //    se vetorNumero[i] > vetorNumero[j] entao
      //      aux <- vetorNumero[j]
      //      vetorNumero[j] <- vetorNumero[i]
      //     vetorNumero[i] <- aux
   //fimse
fimpara
fimpara
para i de 1 ate 6 faca
escreval(vetorNumero[i])
fimpara
fimalgoritmo
