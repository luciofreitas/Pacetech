algoritmo "Gabarito e Cadastro de Prova"
// Função :
// Autor :
// Data : 02/06/2022
// Seção de Declarações
var
gabarito: vetor[1..10] de literal
opcaoMenu: literal
notaFinal: real
procedimento mostrarMenu()
inicio
escreval("1 - Cadastrar Gabarito")
escreval("2 - Cadastrar Prova")
escreval("3 - Sair")
leia(opcaoMenu)
fimprocedimento

procedimento cadastrarGabarito()
var
i: inteiro

inicio
para i de 1 ate 10 faca
   escreval("Informe a resposta da questão: ",i)
   leia(gabarito[i])
fimpara

fimprocedimento

funcao cadastrarProva(): real
var
i, nota: inteiro
resposta: literal
inicio
nota <- 0
para i de 1 ate 10 faca
   escreval("Informe a resposta da questão: ",i)
   leia(resposta)
   se resposta = gabarito[i] entao
      nota <- nota + 1
   fimse
   retorne nota
fimpara
fimfuncao

funcao verificarSituacao(nota: inteiro): literal
inicio
se nota >= 7 entao
   retorne "Aprovado"
senao
   retorne "Reprovado"
fimse
fimfuncao
inicio
repita
   mostrarMenu()
   escolha opcaoMenu
   caso "1"
      cadastrarGabarito()
   caso "2"
      notaFinal <- cadastrarProva()
      escreval(verificarSituacao(notaFinal))
   caso "3"
   outrocaso
      escreval("Opção Invalida")
   fimescolha
ate opcaoMenu = "3"
fimalgoritmo
