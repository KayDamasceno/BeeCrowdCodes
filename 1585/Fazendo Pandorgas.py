import sys

n = int(input())

while n!=0 :

    entrada = input().split()
    saida = (int(entrada[0])*int(entrada[1]))/2
    print("%d cm2" % int(saida))

    n-=1
