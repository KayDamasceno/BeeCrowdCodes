def solve ():

    participantes = input().split()

    for number in participantes:
        if int(number) == (participantes.index(number) + 1):
            print(number)
            break
    print()

n = int(input())
i = 1
while n!=0:

    print("Teste " + str(i))
    solve()
    n = int(input())
    i+=1
