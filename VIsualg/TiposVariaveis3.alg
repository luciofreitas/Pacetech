algoritmo "Trabalhando com Tipos"
// Função :
// Autor :
// Data : 17/05/2022
// Seção de Declarações 
var
   numero1, numero2, soma, subtracao, multiplicacao: inteiro
   divisao: real
   sucesso: logico
inicio
      Escreval ("Insire o primeiro numero: ")
      leia(numero1)
      Escreval ("Insire o segundo numero: ")
      leia(numero2)
      sucesso <- numero1 > 10
      Escreval (sucesso)
      soma <- numero1 + numero2
      subtracao <- numero1 - numero2
      multiplicacao <- numero1 * numero2
      divisao <- numero1 / numero2
      Escreval(soma)
      Escreval(subtracao)
      Escreval(multiplicacao)
      Escreval(divisao)
fimalgoritmo
