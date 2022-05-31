algoritmo "ExercicioVetores"
// Função :
// Autor :
// Data : 31/05/2022
// Seção de Declarações
var
numeros1, numeros2, numeros3: vetor[1..5] de inteiro
i, aux: inteiro
opcao: literal
inicio
para i de 1 ate 5 faca
   escreval("1 - Numero: ",i)
   leia(numeros1[i])
fimpara

para i de 1 ate 5 faca
   escreval("2 - Numero: ",i)
   leia(numeros2[i])
fimpara
escreval("1 - soma")
escreval("2 - subtracao")
leia(opcao)

se opcao = "1" entao
   para i de 1 ate 5 faca
      numeros3[i] <- numeros1[i] + numeros2[i]
   fimpara
senao
   se opcao = "2" entao
      para i de 1 ate 5 faca
         numeros3[i] <- numeros1[i] - numeros2[i]
      fimpara
   fimse
fimse

fimalgoritmo
