def solve():
    eq = input().split()
    result = 0
    if eq[1] == "+":
        result = int(eq[0]) + int(eq[2])
    if eq[1] == "-":
        result = int(eq[0]) - int(eq[2])
    if eq[1] == "x":
        result = int(eq[0]) * int(eq[2])

    
    qtde = abs(result - int(eq[4]))
    
    print("E"+qtde*"r"+"ou!")


t = int(input())

for _ in range(t):
    solve()
