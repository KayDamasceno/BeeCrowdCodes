n = int(input())

meninos = 0
meninas = 0
while n!=0:
    nome, sexo = input().split()

    if sexo == "F":
        meninas+=1
    else:
        meninos+=1
   

    n-=1

print("%s carrinhos"%meninos)
print("%s bonecas"%meninas)
