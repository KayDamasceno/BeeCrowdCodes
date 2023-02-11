import sys
import math
c = int(input())
contador = 0
def countdivisors(n):
    _root = int(math.sqrt(n))
    if _root*_root == n:
        return "impar"
    else:
        return "par"

while c != 0:

    x = int(input())
    if x!=0 and x!=1:
        for i in range(1, x+1):
         # print(i, countdivisors(i))
            if countdivisors(i) == 'impar':
                contador+=1

        print(x - contador)
        contador = 0

    else:
        print(0)

    c -= 1


