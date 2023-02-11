import sys

while True:
    try:
        entrada = input()
        numeros = entrada.split(" ")

        s = int(numeros[0])
        v1 = int(numeros[1])
        v2 = int(numeros[2])

        t = s/(v1-v2)
        if t<=0:
            print("impossivel")
        else:
            print("%.2f" % t)

    except EOFError:
        break
