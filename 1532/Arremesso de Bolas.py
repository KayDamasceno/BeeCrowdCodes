N, V = map(int, input().split())

while N!=0 and V!=0:
    possible = False

    for j in range(V, 0, -1):
        value = j
        i = j
        saltos = 1

        while value < N and i != 0:
            if saltos == i:
                saltos = 0
                i-=1
            
            value+=i
            saltos+=1

        
        if value == N:
            possible = True
            break
    

    if possible:
        print("possivel")
    else:
        print("impossivel")


    N, V = map(int, input().split())
