n, f = map (int, input().split())

numbers = input().split()
flags = []
for x in range(len(numbers)):
    flags.append([int(numbers[x]), False])
maxi = 0
count = 0
for x in range(0, len(numbers)-1):
    value = flags[x+1][0] - flags[x][0]
    #print(value)
    if value <= f:
        if flags[x+1][1] == False:
            count+=1
            flags[x+1][1] = True
        if flags[x][1] == False:
            count+=1
            flags[x][1] = True

        
    
    else:
        if count >= maxi:
            maxi = count
        count = 0
if count >= maxi:
    maxi = count

if len(numbers)==1:
    print(1)
else:

    print(maxi)
