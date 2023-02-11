import math
a, b = map(int, input().split())

for i in range(0, int(math.fabs(b))):
    for j in range(-1000, 1000):
        if j*b + i == a:
            print("%s %s"%(j, i))
            break
