a, b, c = map(int, input().split())
bolos = 0

while a>=2 and b>=3 and c>=5:
    a = a - 2
    b = b - 3
    c = c - 5

    bolos+=1

print(bolos)
