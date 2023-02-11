n = int(input())


while n!=0:
    m, k = map(int, input().split())
    atual = m
    if m < k:
        print(m)
    else:
        value = int(m/k) + m%k
        print(value)
    n-=1
