import sys

n = int(input())

while n > 0:
    numeros = input().split()

    valor = numeros[0].find(numeros[1],len(numeros[0])-len(numeros[1]))

    if valor!=-1:
        print("encaixa")
    else:
        print("nao encaixa")
    n-=1



