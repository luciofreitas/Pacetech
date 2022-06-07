algoritmo "Função e Procedimentos"
// Função :
// Autor :
// Data : 01/06/2022
// Seção de Declarações
var
lado1, lado2, lado3: inteiro

procedimento lerDados()
inicio
escreval("Lado1: ")
leia(lado1)
escreval("Lado2: ")
leia(lado2)
escreval("Lado3: ")
leia(lado3)
fimprocedimento

funcao verificarIntegridadeTriangulo():logico
inicio
se (lado1 > lado2 + lado3) ou (lado2 > lado1 + lado3) ou (lado3 > lado1 + lado2) entao
   retorne falso
senao
   retorne verdadeiro
fimse
fimfuncao

funcao verificarTipoTriangulo():literal
inicio
se (lado1 = lado2) e (lado2 = lado3) entao
   retorne "Equilatero"
senao
   se (lado1 = lado2) ou (lado2 = lado3) ou (lado1 = lado3) entao
      retorne "Isosceles"
   senao
      retorne "Escaleno"
   fimse
fimse

fimfuncao

inicio

lerDados()
se verificarIntegridadeTriangulo() entao
   escreval(verificarTipoTriangulo())
   senao
   escreval("Nao é um triangulo")
fimse

fimalgoritmo
