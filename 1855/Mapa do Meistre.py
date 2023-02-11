visited = []

    
    
def valid(i , j):
    if [i,j] in visited:
        return False
    if i < 0 or i >= y or j < 0 or j >= x :
        return False
    
    return True
    

x = int(input())
y = int(input())

grid = []
found = False


for i in range(y):
    linha = list(input())
    grid.append(linha)

i = 0
j = 0
dirX = 0
dirY = 0
while True:
   
    if grid[i][j] == "*":
        found = True
        break

    if not valid(i,j):
        break
    visited.append([i,j])

    if grid[i][j] == ">":
        dirX = 1
        dirY = 0
    elif grid[i][j] == "<":
        dirX = -1
        dirY = 0
    elif grid[i][j] == "^":
        dirY = -1
        dirX = 0
    elif grid[i][j] == "v":
        dirY = 1
        dirX = 0
    
    j = j+dirX
    i = i+dirY

if found:
    print("*")
else:
    print("!")
    






