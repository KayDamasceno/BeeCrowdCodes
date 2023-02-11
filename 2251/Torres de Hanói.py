count = 0
def countmoves(n):
    if n == 0:
        return 0
    
    return 2*countmoves(n-1)+1

n = int(input())

cases = 1
while n!=0:
    


    print("Teste %s"%(cases))
    print(countmoves(n))
    print("")



    cases+=1



    n = int(input())
