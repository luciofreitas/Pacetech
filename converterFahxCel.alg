algoritmo "semnome"
// Função :
// Autor :
// Data : 17/05/2022
// Seção de Declarações
var
tempCel, tempFah: real
inicio
Escreval ("Escreva por favor a temperatura desejada: ")
leia(tempFah)
tempCel <- (tempFah-32)/1.8
Escreval ("A temperatura em Celsius é:")
Escreval (tempCel:1:2)

se tempCel <= 15 entao
   Escreval ("A temperatura está fria")
senao
   se tempCel <=  28 entao
      Escreval ("A temperatura está agradavel")
   senao
      Escreval ("A temperatura está quente")
   fimse
fimse

//ctrl + g para identar

fimalgoritmo
