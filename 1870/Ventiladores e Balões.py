C, L, P = map(int, input().split())

while C!=0 and L!=0 and P!=0:

    matrix = []
    
    for i in range(C):
        numbers = [int(x) for x in input().split()]
        matrix.append([0] + numbers)
    
    

    stateBalloon = 0
    linha = 0
    coluna = P
    potenciaDireita = -1
    potenciaEsquerda = -1

    while linha < C:

        for j in range(coluna, L+1):
            
            if matrix[linha][j] != 0:
                potenciaDireita = matrix[linha][j]
                break

        
        for k in range(coluna, 0, -1):

            if matrix[linha][k] != 0:
                potenciaEsquerda = matrix[linha][k]
                break

        coluna = coluna + (potenciaEsquerda-potenciaDireita)
        

        if matrix[linha][coluna] != 0 or coluna < 1 or coluna > L:
            stateBalloon = 1
            break

        linha+=1

    if stateBalloon == 1:
        print("BOOM " + str(linha+1)+" "+str(coluna))
    else:
        print("OUT " + str(coluna))




    C, L, P = map(int, input().split())
