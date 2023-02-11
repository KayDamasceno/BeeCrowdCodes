M,N = [int(x) for x in input().split()]
grid = []

for i in range(M):
    line = list(input())
    grid.append(line)
terra  = 0
check = 0

for i in range(M):
    for j in range(N):
        interior = 0
        if grid[i][j] == '#':
            terra+=1
            if i - 1 >= 0 and grid[i-1][j] == "#":
                interior+=1
            if i + 1 < M and grid[i+1][j] == "#":
                interior+=1
            if j - 1 >= 0 and grid[i][j-1] == "#":
                interior+=1
            if j + 1 < N and grid[i][j+1] == "#":
                interior+=1
        
        if interior == 4:
            check+=1

print(terra-check)
