algoritmo "Menu"
// Função :
// Autor :
// Data : 21/05/2022
// Seção de Declarações
var

opcaoMenu,opcaoSubMenu, opcaoSubSubMenu: literal

inicio
repita
   escreval("1 - Carros")
   escreval("2 - Motos")
   escreval("3 - Caminhões")
   escreval("4 - sair")
   leia(opcaoMenu)
   limpatela

   se opcaoMenu = "1" entao
      escreval("1 - Conversível")
      escreval("2 - Sedã")
      escreval("3 - SUV")
      escreval("4 - Voltar")
      leia(opcaoSubMenu)
      limpatela
      se opcaoSubMenu = "1" entao
         escreval("Um conversível é um tipo de carro que se transforma,")
         escreval("podendo ser utilizado com a carroceria aberta ou")
         escreval("fechada. Assim, os ocupantes podem remover o teto ")
         escreval("– manual ou automaticamente – e desfrutar do vento e")
         escreval("sol enquanto passeiam. Em geral, esses veículos têm o ")
         escreval("porta-malas pequeno, pois precisam de espaço para guardar")
         escreval("a capota.")
         escreval("")
         escreval("")
         escreval("")
         escreval("1 - Voltar para o Menu principal")
         leia(opcaoSubSubMenu)
         limpatela
      fimse
      se opcaoSubMenu = "1" entao
         escreval("1 - Conversível")
         escreval("2 - Sedã")
         escreval("3 - SUV")
         escreval("4 - Voltar")
      fimse
fimse
ate opcaoMenu <> "4"
fimalgoritmo
