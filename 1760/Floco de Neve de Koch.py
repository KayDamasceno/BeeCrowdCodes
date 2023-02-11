import sys
import math
while True:

    try:
        x = int(input())
        res =  ((2*math.sqrt(3))/5)*(x ** 2)
        print("%.2f"%res)

    except EOFError:
        break

