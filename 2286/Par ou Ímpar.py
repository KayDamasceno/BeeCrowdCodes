n = int(input())
cont = 1
while n!=0:
    print("Teste " + str(cont))

    a = input()
    b = input()

    for i in range(n):

        mao1, mao2 = map(int, input().split())

        if (mao1+mao2)%2 == 0:
            print(a)
        else:
            print(b)


    n = int(input())
    cont+=1
    print()
