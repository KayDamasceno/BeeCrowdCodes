import sys

numeros = []
numeros.append(0)
numeros.append(1)
numeros.append(1)
numeros.append(1)
numeros.append(2)
numeros.append(2)
numeros.append(4)
numeros.append(8)
numeros.append(12)
numeros.append(96)
numeros.append(108)
numeros.append(10368)
numeros.append(10476)
numeros.append(108615168)
numeros.append(108625644)
numeros.append(11798392572168192)
numeros.append(11798392680793836)
while True:
    try:
        n = int(input())
        print(numeros[n-1])

    except EOFError:
        break
