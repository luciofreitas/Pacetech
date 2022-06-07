algoritmo "Funcao e Procedimento Cadastramento"
// Função :
// Autor :
// Data : 02/06/2022
// Seção de Declarações
var
opcaoMenu: literal
clientes: vetor[1..5] de literal

procedimento mostrarMenu()
inicio

escreval("1 - Cadastrar")
escreval("2 - Pesquisar")
escreval("3 - Excluir")
leia(opcaoMenu)

fimprocedimento
procedimento cadastrar()
var
i: inteiro

inicio

para i de 1 ate 5 faca
   se clientes[i] = "" entao
      escreval("Informe o nome do cliente: ")
      leia(clientes[i])
   fimse
fimpara

fimprocedimento
procedimento pesquisar()
var
i: inteiro
nomeAPesquisar: literal
indiceSucesso: inteiro
inicio
escreval("Informe o nome do cliente a pesquisar: ")
leia(nomeAPesquisar)
indiceSucesso <- -1
para i de 1 ate 5 faca
   se clientes[i] = nomeAPesquisar entao
      indiceSucesso <- i
      Interrompa
   fimse
fimpara
se indiceSucesso = -1 entao
   escreval("Cliente nao encontrado")
senao
   escreval("Cliente encontrado na posição: ",indiceSucesso)

fimse
fimprocedimento
procedimento excluir()
var
indiceExclusao: inteiro

inicio
escreval("Informe o indice a excluir: ")
leia(indiceExclusao)
se (indiceExclusao > 5) ou (indiceExclusao < 1) entao
   escreval("Indice invalido")
senao
   clientes[indiceExclusao] <- ""
fimse
fimprocedimento
inicio
repita
   mostrarMenu()
   escolha opcaoMenu
   caso "1"
      cadastrar()
   caso "2"
      pesquisar()
   caso "3"
      excluir()
   outrocaso
      escreval("opcao invalida")
   fimescolha

ate opcaoMenu = "4"

fimalgoritmo
