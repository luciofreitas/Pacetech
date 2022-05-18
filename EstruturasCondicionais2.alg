algoritmo "semnome"
// Função :
// Autor :
// Data : 17/05/2022
// Seção de Declarações
var
nota1, nota2, nota3, media: real
inicio
Escreval("Por favor, informe a primeira nota: ")
leia(nota1)
Escreval("Por favor, informe a segunda nota: ")
leia(nota2)
Escreval("Por favor, informe a terceira nota: ")
leia(nota3)
media <- (nota1+nota2+nota3)/3
Escreval(media)
se media >= 7 entao
   Escreval ("Voce foi aprovado com a nota: ", media)
senao
   se media < 6 entao
      Escreval ("Você ficou reprovado com a nota: ", media)
   senao
      Escreval ("Você ficou em dependencia com a nota: ", media)
   fimse
fimse
fimalgoritmo
