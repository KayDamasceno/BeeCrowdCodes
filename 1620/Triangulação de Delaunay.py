import sys

n = float(input())

while n!=0 :
    temp = n - 3
    aux = n + temp

    x = float((aux - n)/n)

    print("%.6f" % x)

    n = float(input())
