n = int(input())


numbers = input().split()
if len(numbers)==1:
    print(1)
else:
    dif = int(numbers[1])-int(numbers[0])
    esc = 0
    for x in range(0,n-1):
        if int(numbers[x+1]) - int(numbers[x]) != dif:
           # print (numbers[x], numbers[x+1])
            esc+=1
            dif = int(numbers[x+1]) - int(numbers[x])
        
    print(esc+1)
