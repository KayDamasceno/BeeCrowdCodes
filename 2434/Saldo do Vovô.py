n, s = map(int, input().split())


saldo = []
saldo.append(s)

for x in range(n):
    saldo.append(int(input()))
menor = saldo[0]
soma = 0
for x in range(0,len(saldo)):
    soma = soma + saldo[x]

    if soma <= menor:
        menor = soma

print(menor)

