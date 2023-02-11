import math

while True:

    try:
        n = int(input())
        h, c, l = map(int, input().split())

        hipo = math.sqrt(c*c + h*h)
        sizeTotal = n*hipo

        print("%.4f"%((l*sizeTotal)/10000))
    
    except EOFError:
        break
