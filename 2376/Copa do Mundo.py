letters = []
second = []
third = []
a = ord('A')


for x in range(0, 8):
    m, n = map(int, input().split())

    if m > n:
        letters.append(chr(a))
    else:
        letters.append(chr(a+1))

    a = a+2
i = 0

for x in range(0, 4):
    m, n = map(int, input().split())
    
    if m > n:
        second.append(letters[i])
    else:
        second.append(letters[i+1])
    

    i = i + 2

i = 0

for x in range(0, 2):
    m, n = map(int, input().split())
    
    if m > n:
        third.append(second[i])
    else:
        third.append(second[i+1])
    

    i = i + 2



m, n = map(int,input().split())

if m > n:
    print(third[0])
else:
    print(third[1])

