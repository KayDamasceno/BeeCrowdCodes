import sys
import math


while True:

    try:
        entrada = input().split()
        A = float(entrada[0])
        B = float(entrada[1])
        C = float(entrada[2])

        A = (A*3.141592654)/180
        x = float(math.tan(A)*B)
        

        arvore = x + C

        print("%.2f" %(5*arvore))

    except EOFError:
        break
