def knapsack(W, b, w):
    V = []
    
    for i in range(0,len(b)+1):
        V.append([-1]*(W+1))
    for i in range(0,W+1):
        V[0][i] = 0
    for i in range(1,len(b)+1):
        V[i][0] = 0
    
    for i in range(1,len(b)+1):
        for j in range(1, W+1):
            if w[i-1] <= j:
                if b[i-1] + V[i-1][j-w[i-1]] > V[i-1][j]:
                    V[i][j] = b[i-1] + V[i-1][j-w[i-1]]

                else:
                    V[i][j] = V[i-1][j]
            else:
                V[i][j] = V[i-1][j]
   
    return V[len(b)][W]

n = int(input())


while n!=0:
    

    W = int(input())
    b = []
    w = []

    for i in range(n):
        t, q = map(int, input().split())

        b.append(t)
        w.append(q)


    value = knapsack(W, b, w)
    print("%s min."%(value))
    n = int(input())
