n = int(input())

horarios = []
for i in range(n):

    x, y = [int(x) for x in input().split()]
    horarios.append((x,y))


horarios.sort(key = lambda x:x[1])

max = 1
j = 0

for i in range(0, len(horarios)):
    
    if horarios[i][0] >= horarios[j][1]:
        max+=1
        j = i

print(max)
