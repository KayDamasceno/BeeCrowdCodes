n = int(input())


hob = 0
hu = 0
el = 0
an = 0
ma = 0
for x in range(n):
    a, b = input().split()

    if b == "X":
        hob+=1
    if b == "M":
        ma+=1

    if b == "H":
        hu+=1
    if b == "E":
        el+=1
    if b == "A":
        an+=1

print("%s Hobbit(s)"%hob)
print("%s Humano(s)"%hu)
print("%s Elfo(s)"%el)
print("%s Anao(s)"%an)
print("%s Mago(s)"%ma)

