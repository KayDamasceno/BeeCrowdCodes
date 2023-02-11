x1, x2 = map(int, input().split())

volta = 1
faltando = 0
while faltando < x1:
    faltando = volta*(x2-x1)
    volta+=1



print(volta)
