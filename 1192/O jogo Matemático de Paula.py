n = int(input()) #quantidades de casos testes

for x in range(0,n):
    entrada = input()
    
    x = int(entrada[0])
    y = int(entrada[2])

    if x == y:
        print(x*y)
    else:
        if entrada[1].isupper():
            print(y-x)
        else:
            print(x+y)



