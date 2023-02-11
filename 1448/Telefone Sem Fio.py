# -*- coding: utf-8 -*-

n = int(raw_input())
k = 1


while n > 0:
    n-=1


    name = raw_input()
    first = raw_input()
    second = raw_input()
    c1 = 0
    c2 = 0

    attempt = 2
    
    flag = True

    for x in range(0, len(name)):
        if first[x] == name[x]:
            c1+=1
        else:
            if flag and second[x] == name[x]:
                attempt = 1
                flag = False

        if second[x] == name[x]:
            c2+=1
        else:
            if flag and first[x] == name[x]:
                attempt = 0
                flag = False 

    
    print("Instancia %s"%(k))
    
    if c1 > c2:
        print("time 1")
    elif c1 < c2:
        print("time 2")
    else:
        if attempt == 0:
            print("time 1")
        elif attempt == 1:
            print("time 2")
        else:
            print("empate")

    print("")

    k+=1










    
