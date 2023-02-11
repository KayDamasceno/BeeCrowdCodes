def mdcf(n,m):
    anterior = n
    atual    = m
    resto    = anterior % atual

    while resto != 0:
        anterior = atual
        atual    = resto
        resto    = anterior % atual

    return atual

n = int(input())

numbers = input().split()

numbers = [int(i) for i in numbers]

print(max(numbers)+1)
