while True:
    try:

        n = int(input())
        alunos = []
        for x in range(0,n):
            alunos.append(input().split())
        
        alunos.sort( key= lambda x: (int(x[2]), (x[1]), x[0]))
        
        for x in range(0,n):
            print(alunos[x][0])
    except EOFError:
        break


