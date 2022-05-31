algoritmo "ExercicioVetores"
// Função :
// Autor :
// Data : 31/05/2022
// Seção de Declarações
var
nomes: vetor[1..5] de literal
pesquisa: literal
i: inteiro
encontrado: logico
inicio
para i de 1 ate 5 faca
   escreval("Informe o nome que deseja cadastrar: ")
   leia(nomes[i])
fimpara
limpatela
escreval("Informe um nome que deseja pesquisar: ")
leia(pesquisa)
para i de 1 ate 5 faca
   se nomes[i] = pesquisa entao
      encontrado <- verdadeiro
      escreval("O nome foi encontrado")
   senao
      limpatela
      escreval("O nome nao foi encontrado")
   fimse
fimpara
fimalgoritmo
