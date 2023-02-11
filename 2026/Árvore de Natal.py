t = int(input())
k = 1
while t > 0:
    n = int(input())
    W = int(input())

    dp = [0]*(W+1)

    def max_self(a, b):
        return max(a,b)

    for item in range(n):
        value, weight = map(int, input().split())
        for weight_already in range(W, -1, -1):
            if weight_already+weight < (W + 1):
                dp[weight_already+weight] = max_self(dp[weight_already+weight], dp[weight_already]+value)
                #print(dp)
            
        

    answer = 0
    for i in range(W+1):
        answer = max_self(answer, dp[i])
    print("Galho "+str(k)+":")
    print("Numero total de enfeites: " + str(answer))
    print()

    t-=1
    k+=1

