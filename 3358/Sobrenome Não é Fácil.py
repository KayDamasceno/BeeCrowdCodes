def solve():

    name = input()
    consoant = 0
    for i in range(0, len(name)):

        if name[i].lower() not in "aeiou":
            consoant+=1
        else:
            consoant = 0

        if consoant == 3:
            break

    if consoant >= 3:
        print(name + " nao eh facil")
    else:
        print(name + " eh facil")
        



t = int(input())

for i in range (t):
    solve()
