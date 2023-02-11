n, t = map (int, input().split())
new_alunos = []
for x in range(t):
    new_alunos.append([])
alunos = []
for x in range(n):
    alunos.append(input().split())


alunos = sorted(alunos, key = lambda x : -int(x[1]))

time = 1
for x in range(0, t):
    for j in range(x, n, t):
        try:
            new_alunos[x].append(alunos[j])
        except:
            pass
for k in range(0, t):
    print("Time %s" % (k+1))
    alunos = sorted(new_alunos[k], key= lambda x: x[0])
    for j in range(0, len(alunos)):
        print(alunos[j][0])
    
    print("")

