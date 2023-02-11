c = int(input())

while c > 0:
    p = int(input())
    golG = golB = golR = 0
    for i in range(p):
        M, S = input().split()

        if M == "B":
            if S == "R":
                golB+=2
            else:
                golB+=1
        elif M == "R":
            if S == "G":
                golR+=2
            else:
                golR+=1
        elif M == "G":
            if S == "B":
                golG+=2
            else:
                golG+=1
        

    if golB == golR == golG:
        print("trempate")
    elif golB > golG and golB > golR:
        print("blue")
    elif golG > golB and golG > golR:
        print("green")
    elif golR > golG and golR > golB:
        print("red")
    else:
        if golB == golG:
            print("empate")
        elif golB == golR:
            print("empate")
        elif golG == golR:
            print("empate")
    
    
        


    c-=1
