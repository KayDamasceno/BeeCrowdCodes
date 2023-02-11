h, p, f = map(int, input().split())

while h!=0 and p!=0 and f!=0:
    blocs =[]

    for x in range(h):
        blocs.append(input().split())


    new = input().split()

    for i in range(p-1, -1, -1):
        for j in range(h-1, -1, -1):
        
            if blocs[j][i] == '0':
                
                try:
                    blocs[j][i] = new[0]
                    new.pop(0)
                except:
                    pass

    for x in range(h):
        print(" ".join(blocs[x]))

    h, p, f = map(int, input().split())
