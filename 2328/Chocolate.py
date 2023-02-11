n = input()

splits = input().split()
sum = 0

for i in range(0, len(splits)):
    sum = sum + int(splits[i])-1


print(sum)
