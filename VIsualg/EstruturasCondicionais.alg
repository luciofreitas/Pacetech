algoritmo "Estruturas Condicionais"
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
      se media > 7 entao
         Escreval ("Aprovado")
      senao
         Escreval ("Reprovado")
      fimse
fimalgoritmo
