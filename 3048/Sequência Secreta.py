N = int(input())

maxNumber = 0
number = 0

for x in range (N):

    auxNumber = input()

    if auxNumber!=number:
        maxNumber+=1
        number = auxNumber

    

print(maxNumber)


