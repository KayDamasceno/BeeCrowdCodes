
def solve(n):
    value = n
    cinq = 0
    dez = 0
    cinc = 0
    um = 0
    
    while int(value/50) != 0:
        cinq+=1
        value = value - 50
        
    
    while int(value/10) != 0:
        dez+=1
        value = value - 10
    
    while int(value/5) != 0:
        cinc+=1
        value = value - 5
    
    while int(value/1) != 0:
        um+=1
        value = value - 1

    
    print(str(cinq)+" "+str(dez)+" "+str(cinc)+" "+str(um))
    print()
    

n = int(input())
i = 1
while n!=0:

    print("Teste " + str(i))
    solve(n)
    n = int(input())
    i+=1
