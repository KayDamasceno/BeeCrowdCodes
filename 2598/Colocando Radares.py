import sys

casos = int(input())


while casos != 0:

    entrada = input().split(" ")
    v1 = int(entrada[0])
    v2 = int(entrada[1])

    if v1 % v2 == 0:
        print("%d" % (v1/v2))
    else:
        print("%d" % ((v1/v2) + 1))


    casos-=1
