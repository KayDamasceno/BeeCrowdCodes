n = int(input())

first = input().split()


rows = []
rows.append(first)

for j in range(1, n):
    rest = []
    for i in range(1, n-j+1):
        
        #print(str(j) + " " + str(i))
        if rows[j-1][i-1] == '1' and rows[j-1][i] == '1':
            rest.append('1')
        elif rows[j-1][i-1] == '-1' and rows[j-1][i] == '-1':
            rest.append('1')
        else:
            rest.append('-1')


    rows.append(rest)
    
    #print(rows)


if rows[n-1][0] == '-1':
    print("branca")
else:
    print("preta")
