t = int(input())


for _ in range(t):
    d, i, b = [int(x) for x in input().split()]
    ingredientes = [int(x) for x in input().split()]
    bolos =[]
    for i in range(b):
        pairs = []
      
        pair = input().split()
        

        for j in range(1, len(pair)):
            pairs.append(int(pair[j]))
        custo = 0
        for j in range(0, len(pairs),2):
            custo+=(ingredientes[pairs[j]]*pairs[j+1])
        #print("Custo " + str(custo))
        #print("Bolos " + str(int(d/custo)))
        
        bolos.append(int(d/custo))

    print(max(bolos))
        
