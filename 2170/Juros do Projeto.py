import sys

casos = 1
while True:
    try:
        _read = input()
        numbers = _read.split()
        a = float(numbers[0])
        b = float(numbers[1])

        res = ((100*b)/a) - 100
        print ("Projeto %d:" % casos)
        print ("Percentual dos juros da aplicacao: %.2f %%" % res)
        print()
        casos+=1
    except EOFError:
        break

